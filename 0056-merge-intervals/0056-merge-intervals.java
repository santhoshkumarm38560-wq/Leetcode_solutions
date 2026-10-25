class Solution {
    public static int[][] sort_2d_array_inbuilt(int arr[][]){
        Arrays.sort(arr,(a,b)->{
            if (a[0]==b[0]){
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });        
        return arr;
    }
    public int[][] merge(int[][] arr) {
        arr=sort_2d_array_inbuilt(arr);
        ArrayList<int[]> ans=new ArrayList<>();
        if (arr.length==0){
            return arr;
        }
        ans.add(arr[0]);
        for (int i=1;i<arr.length;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            int last[]=ans.get(ans.size()-1);
            if (start<=last[1]){
                end=Math.max(end,last[1]);
                int temp[]={last[0],end};
                ans.set(ans.size()-1, temp); 
            }
            else{
                int temp[]={start,end};
                ans.add(temp);
            }
        }
        return ans.toArray(new int[ans.size()-1][]);
    }   
}
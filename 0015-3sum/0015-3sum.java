class Solution {
    public static int[] bubblesort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for  (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public List<List<Integer>> threeSum(int[] arr) {
        arr=bubblesort(arr);
        List<List<Integer>> list =new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if (sum<0){
                    j++;
                }
                if (sum>0){
                    k--;
                }
                if (sum==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while (j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while (j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }
        }
        return list;
    }
}
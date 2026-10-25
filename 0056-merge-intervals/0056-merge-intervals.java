class Solution {
    public static int[][] sort(int [][] intervals){
        Arrays.sort(intervals,(a,b)->{
            if (a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        return intervals;
    }
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans=new ArrayList<>();
        intervals=sort(intervals);
        for (int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if (!ans.isEmpty() && ans.get(ans.size()-1)[1]>=intervals[i][1]){
                continue;
            }
            for (int j=i+1;j<intervals.length;j++){
                if (intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            int temp[]={start,end};
            ans.add(temp);
        }
       
        return ans.toArray(new int[ans.size()-1][]);
    }   
}
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double total=0;
        double maxavg=Double.NEGATIVE_INFINITY;
        if (arr.length==1 && k==1){
            return arr[0]/k;
        }
        for(int i=0;i<k-1;i++){
            total=total+arr[i];
        } 
        int j=0;
        for(int i=k-1;i<arr.length;i++){
            total=total+arr[i];

            double average=total/k;

            maxavg=Math.max(maxavg,average);

            total=total-arr[j++];

        }
        return maxavg;
    }
}
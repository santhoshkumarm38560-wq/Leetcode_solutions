class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        int start=0;
        int end=k-1;
        for (int i=start;i<=end;i++){
            sum=sum+arr[i];
        } 
        int maxsum=sum;
        start++;
        end++;
        while (end<arr.length){
            sum=sum-arr[start-1];
            sum=sum+arr[end];
            maxsum=Math.max(maxsum,sum);
            start++;
            end++;
        }
        return (double)maxsum/k;
    }
}
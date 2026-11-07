class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        long max=Long.MIN_VALUE;
        while(left<right){
            int b=right-left;
            int l=Math.min(arr[left],arr[right]);
            long area=l*b;
            max=Math.max(area,max);
            if (arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return (int) max;
    }
}
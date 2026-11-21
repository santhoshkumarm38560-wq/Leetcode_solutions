class Solution {
    public int trap(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int leftmax=0;
        int rightmax=0;
        int total=0;
        while (left<right){
            if (arr[left]<=arr[right]){
                if (leftmax>arr[left]){
                    total+=leftmax-arr[left];
                    left++;
                }
                else{
                    leftmax=Math.max(leftmax,arr[left]);
                    left++;
                }
            }
            else{
                if  (rightmax>arr[right]){
                    total+=rightmax-arr[right];
                    right--;
                }
                else{
                    rightmax=Math.max(rightmax,arr[right]);
                    right--;
                }
            }
        }
        return total;
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int peak=0;
        for (int i=1;i<nums.length-1;i++){
            if (nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                peak=i;
            }
        }
        if (nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        return peak;
    }
}
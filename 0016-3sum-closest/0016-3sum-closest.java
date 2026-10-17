class Solution {
    // public static int[] bubblesort(int[] nums){
    //     for (int i=0;i<nums.length;i++){
    //         for (int j=0;j<nums.length-i-1;j++){
    //             if (nums[j]>nums[j+1]){
    //                 int temp=nums[j];
    //                 nums[j]=nums[j+1];
    //                 nums[j+1]=temp;
    //             }
    //         }
    //     }
    //     return nums;
    // }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if (Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                }
                else if (sum<target){
                    j++;
                }
                else if (sum>target){
                    k--;
                }
                else{
                    return sum;
                }
            }       
        }
        return closest;
    }
}
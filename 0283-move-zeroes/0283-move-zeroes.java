class Solution {
    public void moveZeroes(int[] nums) {
        int temp1=0;
        while(temp1<nums.length && nums[temp1]!=0){
            temp1++;
        }
        if (temp1==nums.length){
            return;
        }
        int temp2=temp1+1;
        while(temp2!=nums.length){
            if (nums[temp2]!=0){
                int temp=nums[temp1];
                nums[temp1]=nums[temp2];
                nums[temp2]=temp;
                temp1++;
                temp2++;
            }
            else{
                temp2++;
            }
        }

    }
}
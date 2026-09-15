class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length+1;
        int Xor1=0;
        int Xor2=0;
        for (int i=0;i<n-1;i++){
            Xor1=Xor1^nums[i];
            Xor2=Xor2^(i+1);
        }
        return Xor1^Xor2;
    }
}
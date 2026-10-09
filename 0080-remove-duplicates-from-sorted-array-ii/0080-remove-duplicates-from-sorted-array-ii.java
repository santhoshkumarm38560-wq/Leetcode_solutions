class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans[]=new int[nums.length];
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (mp.getOrDefault(nums[i],0)<2){
                ans[j]=nums[i];
                j++;
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
        }
        for (int i=0;i<j;i++){
            nums[i]=ans[i];
        }
        return j;
    }
}
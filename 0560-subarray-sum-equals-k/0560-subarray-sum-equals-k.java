class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int sum=0;
        int maxlen=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum-k;
            if (mpp.containsKey(rem)){
                maxlen+=mpp.get(rem);

            }
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return maxlen;
}
}
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        mp.put(0,-1);
        int maxlen=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if (sum%k==0){
                maxlen=Math.max(maxlen,i+1);
            }
            int rem=sum%k;

            if (mp.containsKey(rem)){
                int len=i-mp.get(rem);
                maxlen=Math.max(maxlen,len);
                if (maxlen>=2){
                    return true;
                }
            }
            if (!(mp.containsKey(rem))){
               mp.put(rem,i);
            }
        }
        return false;
    }
}
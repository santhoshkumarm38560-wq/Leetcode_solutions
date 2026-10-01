class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        int maxlen=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for (int x: set){
            if (!(set.contains(x-1))){
                int len=1;
                int y=x;
            while(set.contains(y+1)){
                len++;
                y++;
            }
            maxlen=Math.max(maxlen,len);
        }
            
            
        }
        return maxlen;
    }
}
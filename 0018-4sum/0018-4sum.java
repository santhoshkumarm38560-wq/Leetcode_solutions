class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for (int i=0;i<nums.length-3;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j=i+1;j<nums.length-2;j++){
                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int a=j+1;
                int b=nums.length-1;
                while(a<b){
                    long sum=(long) nums[i]+nums[j]+nums[a]+nums[b];
                    if (sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        list.add(temp);
                        a++;
                        b--;
                        while (a<b && nums[a]==nums[a-1]){
                            a++;
                        }
                        while (a<b && nums[b]==nums[b+1]){
                            b--;
                        }
                    }
                    else if (sum<target){
                        a++;
                    }
                    else{
                        b--;
                    }
                }
            }
        }
        return list;
    }
}
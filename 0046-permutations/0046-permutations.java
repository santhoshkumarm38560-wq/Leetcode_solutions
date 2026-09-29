class Solution {
    public static int[] swap(int nums[],int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        
        return nums;
    }
    public static void permut(int nums[],int idx,List<List<Integer>> ans){
        if (idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for (int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;

        }
        for (int i=idx;i<nums.length;i++){
            swap(nums,i,idx);

            permut(nums,idx+1,ans);

            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        permut(nums,0,list);

        return list;

    }
}
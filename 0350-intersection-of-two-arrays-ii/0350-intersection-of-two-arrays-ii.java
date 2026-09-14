class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> inter=new ArrayList<>();
        for (int i=0;i<nums1.length;i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
        }
        for (int i=0;i<nums2.length;i++){
            if (mp.containsKey(nums2[i]) && mp.get(nums2[i])>0){
                inter.add(nums2[i]);
                mp.put(nums2[i],mp.get(nums2[i])-1);
            }
        }
        int ans[]=new int[inter.size()];
        for (int i=0;i<inter.size();i++){
            ans[i]=inter.get(i);
        }
        return ans;
    }
}
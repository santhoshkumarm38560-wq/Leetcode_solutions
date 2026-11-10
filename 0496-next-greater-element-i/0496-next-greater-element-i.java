class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums1.length];
        for (int i=0;i<nums1.length;i++){
            st.clear();
            int ele=nums1[i];
            for(int j=nums2.length-1;j>=0;j--){
                while (!st.isEmpty() && nums2[j]>st.peek()){
                    st.pop();
                }
                if (nums2[j]==ele){
                    ans[i]=st.isEmpty()? -1:st.peek();
                    break;
                }
                st.push(nums2[j]);
            }
        }
        return ans;
    }
}
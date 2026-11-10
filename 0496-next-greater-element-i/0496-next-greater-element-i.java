class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            mp.put(arr1[i], i);
        }
        for (int i=arr2.length-1;i>=0;i--){
            while (!st.isEmpty() && arr2[i]>=st.peek()){
                st.pop();
            }
            if (mp.containsKey(arr2[i])){
                ans[mp.get(arr2[i])]=st.isEmpty() ? -1:st.peek();
            }
            st.push(arr2[i]);
        }
        return ans;
    }
}
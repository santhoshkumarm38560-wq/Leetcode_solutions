class Solution {
    public static int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int nse=arr.length;
        int pse=-1;
        int max=0;
        for (int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                int element=st.pop();
                nse=i;
                pse=st.isEmpty() ? -1 :st.peek();
                int area=arr[element]*(nse-pse-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int element=st.pop();
            nse=arr.length;
            pse=st.isEmpty() ? -1 :st.peek();
            int area=arr[element]*(nse-pse-1);
            max=Math.max(max,area);
        }
        return max;
    }
}
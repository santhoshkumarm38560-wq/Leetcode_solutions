class Solution {
    public int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            if (!st.isEmpty() && st.peek()>0 && arr[i]<0){
                while (!st.isEmpty() && st.peek()>0 && Math.abs(st.peek()) < Math.abs(arr[i])){
                    st.pop();
                }
                if (st.isEmpty()){
                    st.push(arr[i]);
                }
                else if(st.peek()<0) {
                    st.push(arr[i]);
                }
                else if (!st.isEmpty() && Math.abs(st.peek())==Math.abs(arr[i])){
                    st.pop();
                }   
            }
            else{
                st.push(arr[i]);
            }
        }
        if (st.isEmpty()){
            return new int[]{};
        }
        int ans[]=new int[st.size()];
        int j=0;
        while (!st.isEmpty()){
            ans[j]=st.pop();
            j++;
        }
        ans=reverse(ans);
        return ans;
    }
}
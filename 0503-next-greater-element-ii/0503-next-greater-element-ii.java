class Solution {
    public int[] nextGreaterElements(int[] arr) {
         Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        int n=arr.length;
        for (int i=2*n-1;i>=0;i--){
                while(!st.isEmpty() && arr[i%n]>=st.peek()){
                    st.pop();
                }
                if (i<n){
                    if (st.isEmpty()){
                        ans[i]=-1;
                    }
                    else{
                        ans[i]=st.peek();
                    }
                }
                st.add(arr[i%n]);
            }
            return ans;
        }
    }


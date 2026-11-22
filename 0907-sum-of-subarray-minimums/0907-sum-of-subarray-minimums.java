class Solution {
    public static int[] previous(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.add(i);
        }
        return ans;
    }
    public static int[] next(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i]=arr.length;
            }
            else{
                ans[i]=st.peek();
            }
            st.add(i);
        }
        return ans;
    }
    public static int sumSubarrayMins(int[] arr){
        long sum=0;
        int righta[]=next(arr);
        int lefta[]=previous(arr);
        long mod=(int)(1e9+7);
        for (int i=0;i<arr.length;i++){
            int left=i-lefta[i];
            int right=righta[i]-i;
            long contribution=((long)arr[i]*left*right)%mod;
            sum=(sum+contribution)%mod;
        }
        return (int)sum;
    }
}
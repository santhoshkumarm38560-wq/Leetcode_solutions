class Solution {
    public static int[] nextsmallerelement_index(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }
    public static int[] previoussmallerelement_index(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }
    public static long sumSubarrayMins_optimal(int[] arr){
        long sum = 0;
        int mod = 1000000007;

        int left[] = previoussmallerelement_index(arr);
        int right[] = nextsmallerelement_index(arr);

        for (int i = 0; i < arr.length; i++) {
            long leftcount = i - left[i];
            long rightcount = right[i] - i;

            long contribution = (long) arr[i] * leftcount * rightcount;

            sum = (sum + contribution);
        }

        return sum;
    }
    public static int[] next_greater_element_index(int arr[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){     
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
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
    public static int[] previous_greater_element_index(int arr[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){     
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
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
    public static long sumSubarrayMaxs_optimal(int[] arr){
        long sum = 0;
        int mod = 1000000007;
        int prev[]=previous_greater_element_index(arr);
        int next[]=next_greater_element_index(arr);
        for (int i=0;i<arr.length;i++){
            long leftcount = i - prev[i];
            long rightcount = next[i] - i;

            long contribution = (long) arr[i] * leftcount * rightcount;

            sum = (sum + contribution);
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return (sumSubarrayMaxs_optimal(nums)-sumSubarrayMins_optimal(nums));
    }
}
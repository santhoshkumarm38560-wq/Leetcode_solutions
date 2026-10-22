class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st=new HashSet<>();
            while(n>0){
                int sum=0;
                while (n>0){
                    int digit=n%10;
                    sum=sum+digit*digit;
                    n=n/10;
                }
                if (sum==1){
                    return true;
                }
                if (st.contains(sum)){
                   break;    
                }
                st.add(sum);
                n=sum;

            }
            return false;
    }
}
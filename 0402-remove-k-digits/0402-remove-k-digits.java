class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for (int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while (!st.isEmpty() && k>0 && Character.getNumericValue(ch)<st.peek()){
                st.pop();
                k--;
            }
            st.push(Character.getNumericValue(ch));
        }
        if (st.isEmpty()){
            return "0";
        }
        while(k>0){
            st.pop();
            k--;
        }
        while (!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        int i=0;
        while (i<ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        if (ans.length()==i){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for (int j=i;j<ans.length();j++){
            char ch=ans.charAt(j);
            sb.append(ch);
        }
        return sb.toString();
    }
}
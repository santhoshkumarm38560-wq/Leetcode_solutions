class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                char ch=st.peek();
                if((s.charAt(i) !=ch)&&(s.charAt(i)==Character.toUpperCase(ch) || ch==Character.toUpperCase(s.charAt(i)))){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        sb=sb.reverse();
        return sb.toString();
    }
}
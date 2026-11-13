class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (!Character.isWhitespace(ch)){
                sb.append(ch);
            }
            else{
                if (sb.length() > 0) {
                    st.push(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }
        if (sb.length()>0){
            st.add(sb.toString());
        }
        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.pop());
            ans.append(" ");
        }
        String fin=ans.toString();
        fin=fin.strip();
        return fin;
    }
}
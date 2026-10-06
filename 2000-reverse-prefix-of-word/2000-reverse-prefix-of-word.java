class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<word.length() && word.charAt(i)!=ch){
           st.push(word.charAt(i));
           i++;
        }
        if (i==word.length()){
            return word;
        }
        st.push(ch);

        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.append(word.substring(i+1));
        return sb.toString();

    }
}
class Solution {
    public static int operate(String ch,int a ,int b){
        if (ch.equals("+")){
            return a+b;
        }
        else if(ch.equals("-")){
            return a-b;
        }
        else if(ch.equals("*")){
            return a*b;
        }
        else{
            return a/b;
        }
    }
    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true; // Successfully parsed
        } catch (NumberFormatException e) {
            return false; // Not a valid integer
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if (isInteger(str)){
                st.add(Integer.parseInt(str));
            }
            else{
                int top1=st.pop();
                int top2=st.pop();
                int ans=operate(str,top2,top1);
                st.add(ans);
            }
        }
        return st.peek();
    }
}
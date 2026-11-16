class Solution {
    public static String rotate(String s){
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
        }
        sb.append(s.charAt(0));
        return sb.toString();
    }
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        for (int i=0;i<s.length();i++){
            s=rotate(s);
            if (s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
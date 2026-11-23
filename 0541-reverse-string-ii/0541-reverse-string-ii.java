class Solution {
    public static StringBuilder reverse(StringBuilder s,int start,int end){
        StringBuilder sb=new StringBuilder(s); 
        while(start<=end){
            char frontchar=sb.charAt(start);
            char backchar=sb.charAt(end);
            sb.setCharAt(start,backchar);
            sb.setCharAt(end,frontchar);
            start++;
            end--;
        }
        return sb;
    }
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        if (k>=sb.length()){
            sb.reverse();
            return sb.toString();
        }
        int i=0;
        while (i<sb.length()){
            int j=Math.min(i+k,sb.length());
            sb=reverse(sb,i,j-1);
            i=i+2*k;
        }
        return sb.toString();
    }
}
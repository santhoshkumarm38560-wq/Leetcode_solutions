class Solution {
    public String reverseVowels(String s) {
        int temp1=0;
        int temp2=s.length()-1;
        List<Character> list=new ArrayList<>(List.of('A','a','E','e','I','i','O','o','U','u'));
        StringBuilder sb=new StringBuilder(s);
        while (temp1<sb.length() && !list.contains(sb.charAt(temp1))){
            temp1++;
        }
        while (temp2>=0 && !list.contains(sb.charAt(temp2))){
            temp2--;
        }
        while (temp1<temp2){
            if (list.contains(sb.charAt(temp1)) && list.contains(sb.charAt(temp2))){
                char temp=sb.charAt(temp1);
                sb.setCharAt(temp1,sb.charAt(temp2));
                sb.setCharAt(temp2,temp);
                temp1++;
                temp2--;
            }
            else if (!list.contains(sb.charAt(temp1))){
                temp1++;
            }
            else if (!list.contains(sb.charAt(temp2))){
                temp2--;
            }
        }
        return sb.toString();
    }
}
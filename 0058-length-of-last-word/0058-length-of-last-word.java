class Solution {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        int count=0;
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if (ch!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
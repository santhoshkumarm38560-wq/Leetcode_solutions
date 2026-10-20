class Solution {
    // public static String secondhalf(String s){
    //     int i=0;
    //     int j=s.length()-1;
    //     int mid=i+(j-i)/2;
    //     int k=0;
    //     String n;
    //     for (int i=mid;i<s.length();i++){
            
    //     }
    // }
    // public static String reverse(String s){
    //     int i=0;
    //     int j=s.length()-1;
    //     while (i<=j){
    //         char temp=s[i];
    //         s[i]=s[j];
    //         s[j]=temp;
    //         i++;
    //         j--;
    //     }
    //     return s;
    // }
    public boolean isPalindrome(String s) {
        String lower=s.toLowerCase();
        String cleaned=lower.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb=new StringBuilder(cleaned);
        for (int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);

        }
        if (sb.toString().equals(cleaned)){
            return true;
        }
    
        return false;
        
    }
}
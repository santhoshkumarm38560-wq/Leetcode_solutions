class Solution {
    public int reverse(int x) {
        int rev=0;
        if (x==0){
            return 0;
        }
        
        boolean a=x<0;
        if (a){
            x=-x;
        }
        
        while(x>0){
            int digit=x%10;
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            rev=rev*10+digit;
            x=x/10;
        }
        if(a){
            return -rev;
        }
        
        return rev;
    }
}
class Solution {

    public int[] plusOne(int[] digits) {
        if (digits[0]==0){
            digits[0]=1;
            return digits;
        }
        int sum=0;
        int carry=1;
        for (int i=digits.length-1;i>=0;i--){
            sum=carry;
            sum=sum+digits[i];
            digits[i]=sum%10;
            carry=sum/10;
        }
        if (carry!=0){
            int[] ans=new int[digits.length+1];
            ans[0]=carry;
            return ans;
        }
        return digits;
    }
}
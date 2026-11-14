class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int sum=0;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while (i>=0 || j>=0){
            sum=carry;
            if (i>=0){
                sum=sum+Character.getNumericValue(num1.charAt(i));
            }
            if (j>=0){
                sum=sum+Character.getNumericValue(num2.charAt(j));
            }
            sb.append(String.valueOf(sum%10));
            carry=sum/10;
            if (i>=0){
                i--;
            }
            if (j>=0){
                j--;
            }
        }
        if (carry!=0){
            sb.append(carry);
        }
        StringBuilder res=sb.reverse();
        String s=res.toString();
        return s;
    }
}
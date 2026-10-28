class Solution {
    public int maxProduct(int[] arr) {
        long maxend=arr[0];
        long minend=arr[0];
        long maxprod=arr[0];
        for(int i=1;i<arr.length;i++){
           int curr=arr[i];
           if (curr<0){
                long temp=maxend;
                maxend=minend;
                minend=temp;
            }

            maxend=Math.max(curr,maxend*curr);
            minend=Math.min(curr,minend*curr);

            maxprod=Math.max(maxprod,maxend);
        }
        return (int)maxprod;
    }
}
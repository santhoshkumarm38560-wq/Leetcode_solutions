class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int a=arr[0].length;
        int n=a*a;
        int xor=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                xor=xor^arr[i][j];
            }
        }
        for (int i=1;i<=n;i++){
            xor=xor^i;
        }
        int pos=0;
        while(true){
            if ((xor&(1<<pos))!=0){
                break;
            }
            pos++;
        }
        int zero=0;
        int one=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if ((arr[i][j] & (1<<pos))!=0){
                    one=one^arr[i][j];
                }
                else{
                    zero=zero^arr[i][j];
                }
            }
        }
        for (int i=1;i<=n;i++){
            if ((i&(1<<pos))!=0){
                one=one^i;
            }
            else{
                zero=zero^i;
            }
        }
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i][j]==zero){
                    count++;
                }
            }
        }
        if (count==2){
            int ans[]={zero,one};
            return ans;
        }
        int ans[]={one,zero};
        return ans;
    }
}
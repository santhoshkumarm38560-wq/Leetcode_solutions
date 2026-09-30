class Solution {
    public int[] replaceElements(int[] arr) {
        // if (arr.length==1){
        //     arr[0]=-1;
        // }
        for (int i=0;i<arr.length;i++){
            if (i+1==arr.length){
                arr[i]=-1;
                return arr;
            }
            int largest=arr[i+1];
            for (int j=i+1;j<arr.length;j++){
                largest=Math.max(largest,arr[j]);
            }
            arr[i]=largest;
        }
        return arr;

    }
}
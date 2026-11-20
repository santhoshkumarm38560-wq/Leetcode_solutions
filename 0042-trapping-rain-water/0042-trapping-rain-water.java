class Solution {
    public static int[] prefixmax(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            arr[i+1]=Math.max(arr[i],arr[i+1]);
        }
        return arr;
    }
    public static int[] suffixmax(int arr[]){
        for (int i=arr.length-1;i>0;i--){
            arr[i-1]=Math.max(arr[i],arr[i-1]);
        }
        return arr;
    }
    public int trap(int[] arr) {
        int total=0;
        int left[]=prefixmax(arr.clone());
        int right[]=suffixmax(arr.clone());
        for (int i=0;i<arr.length;i++){
            int leftmax=left[i];
            int rightmax=right[i];
            total+=Math.min(leftmax,rightmax)-arr[i];
        }
        return total;
    }
}
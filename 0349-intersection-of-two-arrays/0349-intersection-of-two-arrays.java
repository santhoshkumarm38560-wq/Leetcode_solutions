class Solution {
    public int[] sort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        sort(nums1);
        sort(nums2);
        int inter[]=new int[nums1.length+nums2.length];
        int temp1=0;
        int temp2=0;
        int i=0;
        while(temp1!=nums1.length && temp2!=nums2.length){
            if (nums1[temp1]<nums2[temp2]){
                temp1++;
            }
            else if (nums2[temp2]<nums1[temp1]){
                temp2++;
            }
            else{
                if (i==0 || inter[i-1]!=nums1[temp1]){
                    inter[i]=nums1[temp1];
                    i++;
                }
                temp1++;
                temp2++;
            }
        }
        return Arrays.copyOf(inter,i);
    }
}
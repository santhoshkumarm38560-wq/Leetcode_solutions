class Solution {
    public static int reverse_pairs_merge(int arr[],int low,int mid,int high){
        int temp1=low;
        int temp2=mid+1;
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        while (temp1<=mid && temp2<=high){
            if(arr[temp1]>2L*arr[temp2]){
                count+=mid-temp1+1;
                temp2++;
            }
            else{
                temp1++;
            }

        }
        temp1=low;
        temp2=mid+1;
        while (temp1<=mid && temp2<=high){
            if (arr[temp1]<=arr[temp2]){
                list.add(arr[temp1]);
                temp1++;
            }
            else{
                list.add(arr[temp2]);
                temp2++;
            }  
        }
        while(temp1<=mid){
            list.add(arr[temp1]);
            temp1++;
        }
        while(temp2<=high){
            list.add(arr[temp2]);
            temp2++;
        }
        for (int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        return count;
    }
    public static int reverse_pairs_divide(int arr[],int low,int high){
        if (low>=high){
            return 0;
        }
        int count=0;
        int mid=low+(high-low)/2;
        count+=reverse_pairs_divide(arr,low,mid);
        count+=reverse_pairs_divide(arr,mid+1,high);
        count+= reverse_pairs_merge(arr,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        return reverse_pairs_divide(nums,0,nums.length-1);
    }
}
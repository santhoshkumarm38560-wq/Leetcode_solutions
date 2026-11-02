class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int start=arr[0];
        int  end=arr[arr.length-1];
        int i=0;
        while (start!=end){
            if(arr[i]!=start){
                list.add(start);
                start++;
            }
            else{
                i++;
                start++;
            }
        }
        return list;
    }
}
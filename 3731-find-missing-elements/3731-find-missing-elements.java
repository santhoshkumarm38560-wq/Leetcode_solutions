class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int start=arr[0];
        for (int i=0;i<arr.length;i++){
            while(start<arr[i]){
                list.add(start);
                start++;
            }
            start=arr[i]+1;
        }
        return list;
    }
}
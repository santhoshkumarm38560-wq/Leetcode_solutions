class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex=rowIndex+1;
        long res=1;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for (int i=1;i<rowIndex;i++){
            res=res*(rowIndex-i);
            res=res/i;
            list.add((int)res);
        }
        return list;
    }
}
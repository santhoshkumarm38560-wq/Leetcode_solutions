class Solution {
    public List<Integer> ncr(int r){
        List<Integer> temp=new ArrayList<>();
        int res=1;
        temp.add(1);
        for (int i=1;i<r;i++){
            res=res*(r-i);
            res=res/(i);
            temp.add(res);
        }
        return temp;   
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            list.add(ncr(i));
        }
        return list;
    }
}
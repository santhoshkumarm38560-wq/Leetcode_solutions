class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> canda=new ArrayList<>();
        int cand1=0;
        int cand2=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==cand1){
                count1++;

            }
            else if (nums[i]==cand2){
                count2++;

            }
            else if(count1==0){
                count1=1;
                cand1=nums[i];
            }
            else if (count2==0){
                count2=1;
                cand2=nums[i];
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for (int i=0;i<nums.length;i++ ){
            if (nums[i]==cand1){
                count1++;
            }
            if (nums[i]==cand2){
                count2++;
            }
        }
        int i=0;
        if (count1>nums.length/3){
            canda.add(cand1);
            i++;
        }
        if (count2>nums.length/3 && cand2!=cand1){
            canda.add(cand2);
            i++;
        }
        return canda;
    }
}
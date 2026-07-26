class Solution {
    public int removeElement(int[] nums, int val) {
        int key =0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(val != nums[i] ){
                nums[key] = nums[i];
                key++;
                count++;
            }
        }
        return count;
        //return key;
    }
}
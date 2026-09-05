class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ab = new ArrayList<>();
        int start = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] +1 != nums[i+1]){
                if(start == i){
                    ab.add(String.valueOf(nums[start]));
                }else{
                    ab.add(nums[start]+"->"+nums[i]);
                }
                
                start = i+1;
            }
        }

        if(start == nums.length-1){
            ab.add(String.valueOf(nums[start]));
        }else if(start < nums.length){
            ab.add(nums[start]+ "->"+ nums[nums.length-1]);
        }
        return ab;
    }
}
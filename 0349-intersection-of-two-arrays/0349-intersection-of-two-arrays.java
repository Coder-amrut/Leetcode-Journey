class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ab = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j] && !ab.contains(nums1[i])){
                    ab.add(nums1[i]);
                    break;
                }
            }
        }
        int nums3[] = new int[ab.size()];
        for(int i=0; i<ab.size(); i++){
            nums3[i] = ab.get(i);
        }
        return nums3;
    }
}
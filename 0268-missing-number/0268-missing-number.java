import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        //Arrays.sort(nums);
        int n = nums.length;
        int elementSum = 0; 
        int sum = 0;
        for(int i=0; i<n; i++){
            elementSum = elementSum + nums[i];   
        }
        
        sum = n*(n+1)/2;
        int result = sum - elementSum ;
        return result;


    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        //int avg =0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double maxSum = sum;
        for(int i=1; i<=nums.length-k; i++){
            sum = sum - nums[i-1] + nums[i+k-1];
            maxSum = Math.max(maxSum,sum);
        }
        double avg = maxSum / k;
        
        
        return avg;

    }
}
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;

       return Math.max(
        nums[0]* nums[1]* nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]
       );
    }
}
//hya code mdhye apn use kelel
//1st 2 number he jr number negative astil tr ghetlele ahet, 3 number ghetle nhit karn 3rd add kela ki prt ans negative yenar 
//ani jr - number nstil tr apn direct last che number cha product gheto nums[n-1]*nums[n-2]*nums[n-3] like that 

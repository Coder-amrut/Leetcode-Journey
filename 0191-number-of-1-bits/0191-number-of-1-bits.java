class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count=0;
        for(int i=0; i<binary.length(); i++){
            int reminder = binary.charAt(i)-'0';
            if(reminder == 1){
                count++;
            }

        }
        return count;
    }
}

//why -0 beacuse we convery ASCII value to integer 
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ans = new HashSet<>();
        while(n != 1){
            if(ans.contains(n)){
                return false;
            }

            ans.add(n);

            int sum = 0;
            while( n > 0){
                int reminder = n % 10;
                sum += reminder*reminder;
                n = n/10;
            }
            n = sum;
        }
        return true;
        


















        // boolean result = true;

        // while (n != 1 && n != 4) {

        //     int sum = 0;

        //     while (n > 0) {

        //         int reminder = n % 10;
        //         sum += reminder * reminder;
        //         n = n / 10;
        //     }

        //     n = sum;
        // }

        // if (n == 1) {
        //     result = true;
        // } else {
        //     result = false;
        // }

        // return result;



    }
}
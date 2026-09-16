class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            // Current position + left + right
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

            // Window: left, current, right
            if (left == 0 && flowerbed[i] == 0 && right == 0) {

                flowerbed[i] = 1;
                n--;

                if (n == 0)
                    return true;
            }
        }

        return n <= 0;
    }
}
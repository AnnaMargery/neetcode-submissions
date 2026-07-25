class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] helper = new int[flowerbed.length + 2];

        for (int i = 0; i < flowerbed.length; i++) {
            helper[i + 1] = flowerbed[i];
        }

        for (int i = 1; i < helper.length - 1; i++) {
            if (helper[i - 1] == 0 && helper[i] == 0 && helper[i + 1] == 0) {
                helper[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
class Solution {
    public int maxLength(int[] nums) {
        int bestOne = 2, left = 0, prod = 1;
        for (int right = 0; right < nums.length; right++) {
            int x = nums[right];
            while (gcd(prod, x) > 1)
                prod /= nums[left++];
            prod *= x;
            bestOne = Math.max(bestOne, right - left + 1);
        }
        return bestOne;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
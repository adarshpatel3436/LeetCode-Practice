class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int squareSum = 0;

        for(int i = 0; i < n; i++){
            int div = i+1;
            if(n % div == 0){
                squareSum += nums[i] * nums[i];
            }
        }
        return squareSum;
    }
}
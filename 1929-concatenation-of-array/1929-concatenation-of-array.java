class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        if(n<1)
            return nums;

        int[] ans = new int[2*n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
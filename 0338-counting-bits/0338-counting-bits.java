class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int num = i;
            int res = 0; 

            while (num > 0) {
                res++;
                num = num & (num - 1); 
            }
            
            ans[i] = res; 
        }
        return ans;
    }
}
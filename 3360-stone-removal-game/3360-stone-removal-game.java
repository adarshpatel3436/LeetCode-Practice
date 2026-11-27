class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }

        int step = 0;
        for(int i = 10; i > 0; i--){
            if(n >= i){
                n = n-i;
                step++;
            }else {
                break;
            }
        }
        if(step%2 == 0){
            return false;
        }else {
            return true;
        }
    }
}
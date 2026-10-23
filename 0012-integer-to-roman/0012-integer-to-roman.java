class Solution {
    private static final int[] val = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private static final String[] symbol = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String intToRoman(int num) {

        StringBuilder res = new StringBuilder();

        for(int i = 0; i < 13; i++){
            if(num == 0){
                break;
            }

            int times = num / val[i];
            
            while(times-- > 0){
                res.append(symbol[i]);
            }

            num = num % val[i];
        }
        return res.toString();
    }
}
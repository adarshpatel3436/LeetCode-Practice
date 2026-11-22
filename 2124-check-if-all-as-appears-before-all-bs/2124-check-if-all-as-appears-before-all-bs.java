class Solution {
    public boolean checkString(String s) {
        // (Count 'a's, then verify prefix is all 'a')
        
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                countA++;
        }

        // the first countA characters must all be 'a'
        for (int i = 0; i < countA; i++) {
            if (s.charAt(i) != 'a')
                return false;
        }

        return true;
    }
}
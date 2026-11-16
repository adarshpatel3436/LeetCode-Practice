class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();

            // divide s
            for(int i = 0; i < s.length(); i+=k){
                int sum = 0;

                // calculate sum of dig in curr group

                for(int j = i; j < Math.min(i+k, s.length()); j++){
                    sum += s.charAt(j) -'0';
                }

                // append the dig sum to the new string
                sb.append(sum);
            }

            // update the original string

            s = sb.toString();
        }
        return s;
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        generator(ans, sb, n, 0, 0);
        return ans;
    }

    void generator(List<String> ans, StringBuilder sb,
                   int n, int start, int end) {

        if (start == n && end == n) {
            ans.add(sb.toString());
            return;
        }

        if (start < n) {
            sb.append('(');
            start++;

            generator(ans, sb, n, start, end);

            start--;
            sb.setLength(sb.length() - 1);
        }

        if (end < n && start > end) {
            sb.append(')');
            end++;

            generator(ans, sb, n, start, end);

            end--;
            sb.setLength(sb.length() - 1);
        }  
    }
}
class Solution {
    private void finalParanthesis(int n, List<String> ans, String curr, int open, int close) {
      if(open == 0 && close == 0) {
        ans.add(curr);
        return;
      }
      if(open != 0) {
           finalParanthesis(n, ans, curr+'(', open-1, close);  
      }
      if(close > open) {
        finalParanthesis(n, ans, curr+')', open, close-1);
      }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        finalParanthesis(n, ans, "", n, n);
        return ans;
    }
}
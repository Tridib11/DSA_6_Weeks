import java.util.ArrayList;
import java.util.List;
//// https://leetcode.com/problems/generate-parentheses

public class GenerateParenthesis {
    
}
class Solution {
    public void helper(int n, int open, int closed, List<String> res, String curr) {
        if (closed == n) {
            res.add(curr);
            return;
        }
        // Pick opening
        if (open < n) {
            helper(n, open + 1, closed, res, curr + "(");
        }
        // Pick Closing
        if (open > closed) {
            helper(n, open, closed + 1, res, curr + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n, 0, 0, res, "");
        return res;

    }
}
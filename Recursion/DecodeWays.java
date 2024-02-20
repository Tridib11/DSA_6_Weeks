//https://leetcode.com/problems/decode-ways/
//TLE (Not the most optimized aproach)
public class DecodeWays {

}

class Solution {
    public int helper(String s, int ind) {
        if (ind <= 0)
            return 1;

        int res = 0;

        // single digits as a character => Because 0 is not a valid single character
        if (s.charAt(ind) != '0') {
            res += helper(s, ind - 1);
        }

        // double digits as a character
        // ind,ind-1 => double digit number should be between 1 and 26
        if ((s.charAt(ind - 1) == '1') || (s.charAt(ind - 1) == '2' && s.charAt(ind) >= '0' && s.charAt(ind) <= '6')) {
            res += helper(s, ind - 2);
        }

        return res;

    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        return helper(s, s.length() - 1);
    }
}
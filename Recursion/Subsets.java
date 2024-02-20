// https://leetcode.com/problems/subsets

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, curr, res);
        return res;
    }

    public void helper(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        // include
        curr.add(nums[idx]);
        helper(idx + 1, nums, curr, res);
        curr.remove(curr.size() - 1);
        // exclude
        helper(idx + 1, nums, curr, res);

    }
}

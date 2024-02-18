public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] arr={10,15,20};
        System.out.println(minClimbingStair(arr));
    }    

    public static int helper(int cost[],int idx){
        if(idx>=cost.length) return 0;
            return cost[idx]+Math.min(helper(cost, idx+1),helper(cost, idx+2));
    }
    public static int minClimbingStair(int[] cost){
        return Math.min(helper(cost, 0),helper(cost, 1));
    }
}


/*
 




// https://leetcode.com/problems/min-cost-climbing-stairs
// (TLE solutions - not the most optimised solutions)

//Solution 1 (n-0)

class Solution {

    public int helper(int ind, int[] cost) {
        if(ind <=1 ) return cost[ind];
        return (ind == cost.length ? 0 : cost[ind]) + Math.min(helper(ind-1, cost), helper(ind-2, cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        return helper(cost.length, cost);
    }
}

//Solution 2

class Solution1 {

    public int helper(int ind, int[] cost) {
        if(ind <=1 ) return cost[ind];
        return cost[ind] + Math.min(helper(ind-1, cost), helper(ind-2, cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost.length - 1, cost), helper(cost.length - 2, cost));
    }
}

//Solution 3 From 0 to n

class Solution2 {

    public int helper(int[] cost, int ind) {
        if(ind >= cost.length) return 0;
        return cost[ind] + Math.min(helper(cost, ind+1), helper(cost, ind+2));
    }

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, 0), helper(cost, 1));
    }
}
 */
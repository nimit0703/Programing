// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step



// I will use a recursive approach with memoization to calculate the total number of distinct ways to climb the staircase of 'n' steps.
// I'll create a memoization array to store the results for already calculated steps, which will help avoid redundant calculations. 
// Starting from the base cases where 'n' is 1 or 2, I'll recursively calculate the number of ways to reach the 'n' step by summing the ways from 'n-1' and 'n-2' steps. I'll store the results in the memoization array and return the final result.


class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return calculateWays(n, memo);
    }
    
    private int calculateWays(int n, int[] memo) {
        if (n == 1 || n == 2) {
            return n;
        }
        
        if (memo[n] != 0) {
            return memo[n];
        }
        
        memo[n] = calculateWays(n - 1, memo) + calculateWays(n - 2, memo);
        return memo[n];
    }
}

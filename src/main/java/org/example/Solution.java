package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minCost(int n, int[] cuts) {
        Map<String, Integer> memo = new HashMap<>();
        return dfs(cuts, 0, n, memo);
    }

    private int dfs( int[] cuts, int left, int right, Map<String, Integer> memo) {
        if(left - right == 1) return 0;
        String key = left + " " + right;
        if(memo.containsKey(key) ){
            return memo.get(key);
        }
        int result = Integer.MAX_VALUE;


        for (int cut : cuts) {
            if (cut < right && cut > left) {
                result = Math.min(result, right - left + dfs(cuts, left, cut, memo) + dfs(cuts, cut, right, memo));

            }
        }
        if(result == Integer.MAX_VALUE) result = 0;
        memo.put( left + " " + right, result);
        return result;
    }
}

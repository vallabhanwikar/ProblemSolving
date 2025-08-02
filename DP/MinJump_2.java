package DP;

/**
 * vallabh
 * You are given a 0-indexed array of integers nums of length n.
 * You are initially positioned at nums[0].
 *
 * Each element nums[i] represents the maximum length of a forward jump
 * from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 *
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are
 * generated such that you can reach nums[n - 1].
 */
public class MinJump_2
{
    public static void main(String[] args) {
        int[] inp = {2,3,1,1,4};
        System.out.println(findMinJumps(inp));

        int[] inp1 = {3,2,1,0,4};
        System.out.println(findMinJumps(inp1));

    }

    private static int findMinJumps(int[] inp)
    {
        int[] dp = new int[inp.length];
        for(int i = 1;i<inp.length;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i<inp.length - 1; i++)
        {
            for(int j = i+1; j <= i + inp[i] && j < inp.length; j++)
            {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }

        return dp[inp.length-1];
    }
}

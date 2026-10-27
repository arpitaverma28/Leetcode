class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total =0;
        int n = nums.length;
        for(int i : nums){
            total += i;
        }
        if(total <Math.abs(target)) return 0;
        if(total + target <0 ) return 0;
        if((total +target)%2 != 0) return 0;
        int sum = (total + target)/2;
        int dp[][] = new int[n+1][sum+1];
        for(int i =0;i<=n;i++){
            dp[i][0] =1;
        }
        for(int i =1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(nums[i-1]<=j){
                    dp[i][j] =dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
class Solution {
    Integer [][] dp ;
    public int solve(int i ,int j ,int [] p){
        if(i>j) return 0;
         if (i >= p.length || j < 0) return 0;  
        if(i == j) return p[i];
        if(dp[i][j] != null) return dp[i][j];
        int takei = p[i] + Math.min(solve(i+2,j,p),solve(i+1,j-1,p));
        int takej = p[j] + Math.min(solve(i,j-2,p),solve(i+1,j-1,p));
        return dp[i][j] =Math.max(takei,takej);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
         dp = new Integer[n][n];
        int total =0;
        for(int i : piles){
            total += i;
        }
        int a = solve(0,n-1,piles);
        int b =total -a;
        return a>b;
    }
}
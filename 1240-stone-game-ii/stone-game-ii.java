class Solution {
    int n;
    Integer dp[][][];
    public int solveForAlish(int[] piles, int person,int idx ,int m){
        if(idx>= n) return 0;
        if(dp[person][idx][m] !=null) return dp[person][idx][m];
        int result = (person==1) ? -1 :Integer.MAX_VALUE;
        int stone =0;
        for(int x =1;x<=Math.min(n-idx,2*m);x++){
            stone += piles[idx+x-1];
            if(person ==1){
                result = Math.max(result,stone +solveForAlish(piles,0,idx+x,Math.max(m,x)));
            }else{
                result = Math.min(result,solveForAlish(piles,1,idx+x,Math.max(m,x)));
            }
        }
        return dp[person][idx][m] = result;
    }
    public int stoneGameII(int[] piles) {
    n = piles.length;
    dp = new Integer[2][n+1][n+1];
    return solveForAlish(piles,1,0,1);
        
    }
}
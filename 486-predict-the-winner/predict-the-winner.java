class Solution {
    public int solve(int i,int j ,int []nums){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int takei = nums[i] + Math.min(solve(i+1,j-1,nums),solve(i+2,j,nums));
        int takej = nums[j] + Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));
        return Math.max(takei,takej);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int total =0;
        for(int i : nums){
            total += i;
        }
        int p1 = solve(0,n-1,nums);
        int p2 = total -p1;
        return p1>=p2;
        
    }
}
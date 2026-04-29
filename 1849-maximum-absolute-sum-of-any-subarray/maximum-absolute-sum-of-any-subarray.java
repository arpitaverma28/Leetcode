class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = nums[0];
        int minsum =nums[0];
        int currmin =0;
        int maxsum = nums[0];
        int currmax= 0;
        for(int i : nums){
            currmin = Math.min(i,currmin+i);
            minsum = Math.min(minsum,currmin);

            currmax= Math.max(i,currmax+i);
            maxsum = Math.max(maxsum,currmax);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
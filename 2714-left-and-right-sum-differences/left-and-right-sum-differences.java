class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int right =0;
        for(int i =0;i<n;i++){
            right += nums[i];
        }
        int left =0;
        for(int i =0;i<n;i++){
            ans [i]= Math.abs(right - nums[i] -left);
            left += nums[i];
            right -=nums[i];
        }
        return ans;
    }
}
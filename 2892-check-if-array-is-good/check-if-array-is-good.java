class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i =0;i<nums.length-1;i++){
            if(nums[i] != i+1) return false;
        }
        return nums[i] ==nums.length-1;
    }
}
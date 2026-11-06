class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans =0;
        if(k == 0) return n;
        int must = nums[n-k];
        for(int i : nums){
            if(i<must) ans++;
        }
       return ans; 
    }
}
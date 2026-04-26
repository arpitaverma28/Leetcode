class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans =0;
        int curr=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                curr=0;
            }else{
                curr++;
            }
            ans = Math.max(ans,curr);
        }
        return ans;
    }
}
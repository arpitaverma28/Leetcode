class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int left = 1;
        int right =1;
        for(int i =0;i<nums.length;i++){
           left *= nums[i];
           right *=nums[nums.length-1-i];
           ans = Math.max(ans,Math.max(left,right));
           if(left ==0) left =1;
           if(right ==0) right =1;
            
        }
        return ans;
    }
}
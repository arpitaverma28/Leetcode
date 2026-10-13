class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]<0) nums[i] = -1 *nums[i];
        }
        Arrays.sort(nums);
        long neg =0;
        for(int i =0;i<nums.length/2;i++){
            neg +=(long)(nums[i]*nums[i]);
        }
        long pos =0;
        for(int i =nums.length/2;i<nums.length;i++){
            pos += (long)(nums[i]*nums[i]);
        }
        return pos - neg ;
    }
}
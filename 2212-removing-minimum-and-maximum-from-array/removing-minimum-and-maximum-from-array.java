class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx =0;
        int maxIdx =0;
        int minVal =Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            int curr = nums[i];
            if(curr<minVal){
                minVal = curr;
                minIdx = i ;
            }
            if(curr> maxVal){
                maxVal = curr;
                maxIdx = i;
            }
        }
        int a1 = Math.max(minIdx,maxIdx)+1;
        int a2 =nums.length - Math.min(minIdx,maxIdx);
        int a3 =  Math.min(minIdx,maxIdx)+1 + (nums.length - Math.max(minIdx,maxIdx));
        return Math.min(Math.min(a1,a2),a3);
    }
}
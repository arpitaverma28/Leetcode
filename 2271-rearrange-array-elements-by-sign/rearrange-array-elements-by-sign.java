class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int ans[] = new int[l];
        int p =0;
        int n=1;
        int k =0;
        boolean pos = true;
        while(k<l){
            if(nums[k] >0){
            ans[p] = nums[k];
            p +=2;
            }else{
                ans[n] = nums[k];
                n +=2;
            }
            k++;
        }
        return ans;
    }
}
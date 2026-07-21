class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int low =0;
        int high = nums.length -1;
        while(low<= high){
            int mid= low + (high - low)/2;
            if(nums[mid]== target){
                int s = mid;
                int e = mid;
                while(s>0 && nums[s]==nums[s-1]) s--;
                while(e<nums.length-1 &&  nums[e]==nums[e+1]) e++;
                ans[0] =s;
                ans[1] =e;
                return ans;
            }else if(nums[mid]<target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int low = 1;
        int high = nums.length-2;
        while(low <high){
            int mid =low + (high - low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid+1]) high = mid;
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
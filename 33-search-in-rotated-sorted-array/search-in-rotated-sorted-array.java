class Solution {
    public int helper(int [] arr,int low ,int high,int tar){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==tar) return mid;
            else if(arr[mid]<tar) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high){
             int mid = low + (high-low)/2;
            if(nums[mid]<nums[high]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        int pivote = low;
       if(target >= nums[pivote] && target <= nums[n-1]){
        low = pivote;
        high = n-1;
       }else{
        low =0;
        high=pivote-1;
       }
       return helper(nums,low,high,target);
    }
}
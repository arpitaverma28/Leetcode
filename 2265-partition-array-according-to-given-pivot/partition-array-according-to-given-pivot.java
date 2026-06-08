class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int ans[] = new int[n];
        int less =0;
        int equal =0;
        int more =0;
        for(int i : nums){
            if(i==pivot) equal++;
            else if(i<pivot) less++;
            else more++;
        }
        int l =0;
        int e = less;
        int m = less+ equal;
        for(int i : nums){
            if(i<pivot) {
                ans[l++]=i;
            }else if(i==pivot){
                ans[e++]=i;
            }else{
                ans[m++]=i;
            }
        }
        return ans;
    }
}
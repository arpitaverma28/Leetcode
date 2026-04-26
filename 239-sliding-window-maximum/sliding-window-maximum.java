class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length==0) return new int[0];
        int n = nums.length;
        int []ans = new int[n-k+1];
        Deque<Integer> d = new LinkedList<>();
        for(int i =0;i<n;i++){
            if(!d.isEmpty() && d.peekFirst()<=i-k){
                d.pollFirst();
            }

            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }
            d.offerLast(i);
            if(i>=k-1){
                ans[i-k+1] = nums[d.peekFirst()];
            }
        }
        return ans;
    }
}
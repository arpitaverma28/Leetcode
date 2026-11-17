class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans =0;
        int sum =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i : nums){
            sum += i;
            ans += hm.getOrDefault(sum- goal ,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
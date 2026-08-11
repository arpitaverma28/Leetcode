class Solution {
    public int missingInteger(int[] nums) {
        int sum =nums[0];
        HashSet<Integer> hs = new HashSet<>();
        for(int i =1;i<nums.length;i++){
         if(nums[i] -1 == nums[i-1]) sum +=nums[i];
         else break;
        }
        for(int i : nums){
            hs.add(i);
        }
        while(true){
            if(!hs.contains(sum)) return sum;
            else sum++;
        }
    }
}
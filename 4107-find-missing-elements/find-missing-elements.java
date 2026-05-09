class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
       
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> hm = new HashSet<>();
        for(int i : nums){
            hm.add(i);
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        for(int i =min;i<=max;i++){
            if(!hm.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
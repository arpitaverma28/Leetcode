class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i : nums){
            hm.add(i);
        }
        int i =k;
        while(true){
            if(!hm.contains(i) && i%k ==0) return i;
            i++; 
        }
    }
}
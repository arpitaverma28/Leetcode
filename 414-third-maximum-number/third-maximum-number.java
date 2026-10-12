class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max =0;
        for(int i : nums){
            max = Math.max(max,i);
           if(hs.add(i)){
            pq.add(i);
            if(pq.size() >3) pq.poll();
           }
        }
       if(pq.size()<3) return max;
       return pq.poll() ;
    }
}
class Pair implements Comparable<Pair>{
    int idx;
     int val;
    Pair(int idx,int val){
        this.idx=idx;
        this.val = val;
    }
    @Override
    public int compareTo(Pair p){
     return p.val-this.val;
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int idx =0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int i =0;
        int j=0;
        while(j<n){
           pq.add(new Pair(j,nums[j]));
           while(!pq.isEmpty() && pq.peek().idx<i){
            pq.poll();
           }
           if(j-i+1==k){
            ans[idx++] = pq.peek().val;
            i++;
           }
           j++;
      }   
      return ans;    
    }
}
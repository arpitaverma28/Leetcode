class Solution {
    public class Pair implements Comparable<Pair>{
        char c ;
        int f;
        Pair(char c , int f){
            this.c = c;
            this.f =f;
        }
        public int compareTo(Pair p){
            return p.f - this.f;
        }
    }
    public int minimumPushes(String word) {
        int ans =0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : word.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
         PriorityQueue<Pair> pq = new PriorityQueue<>();
         for(char c : hm.keySet()){
            pq.add(new Pair(c,hm.get(c)));
         }

         int count =0;
         int s = pq.size();
         for(int i =0;i<s;i++){
            Pair p = pq.poll();
            ans += ((i/8)+1)*p.f;
            }
        return ans;
         }
        
    }

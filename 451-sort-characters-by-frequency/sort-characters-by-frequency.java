class Solution {
    class Pair implements Comparable<Pair>{
        char c;
        int f;
        Pair(char c ,int f){
            this.c = c;
            this.f=f;
        }
        public int compareTo(Pair p){
            return p.f-this.f;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(char c : hm.keySet()){
            pq.add(new Pair(c,hm.get(c)));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair p= pq.poll();
            for(int i =0;i<p.f;i++){
                sb.append(p.c);
            }
        }
        return sb.toString();
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2) return false;
       HashMap<Character,Integer> hm1 = new HashMap<>();
       HashMap<Character,Integer> hm2 = new HashMap<>();
        for(char c : s1.toCharArray()){
           hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        int i =0;
        for(int j =0;j<n2;j++){
            char c = s2.charAt(j);
            hm2.put(c,hm2.getOrDefault(c,0)+1);
            if(j-i+1 >n1){
                    char out = s2.charAt(i);
                    hm2.put(out,hm2.get(out)-1);
                    if(hm2.get(out)==0) hm2.remove(out);
                    i++;
            }
            if(hm1.equals(hm2)) return true;
        }
        return false;
    }
}
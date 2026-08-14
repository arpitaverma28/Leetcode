class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i =0;
        int ans =0;
        for(int j=0;j<s.length();j++){
        char c = s.charAt(j);
        hm.put(c,hm.getOrDefault(c,0)+1);
         while(hm.get(c)>2){
            char l = s.charAt(i);
            hm.put(l,hm.get(l)-1);
            i++;
         }
         ans= Math.max(ans,j-i+1);
        }
        return ans;
    }
}
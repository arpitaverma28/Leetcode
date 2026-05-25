class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int ans=0;
        boolean isOdd =false;
        for(int c : hm.values()){
           ans += (c/2)*2;
           if(ans %2 ==0 && c%2 ==1) ans++;
        }
        return ans;
    }
}
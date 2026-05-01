class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <=1) return s.length();
        int ans =0;
        int i=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int j =0;j<s.length();j++){
            char curr = s.charAt(j);

                if(hm.containsKey(curr)){
                 i = Math.max(i, hm.get(curr) + 1);
                }
                hm.put(curr,j);
                ans = Math.max(ans,j-i+1);
            
        }
        return ans;
    }
}
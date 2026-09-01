class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        if (p.length() > s.length()) {
            return ans;
        }
        for(int i =0;i<p.length();i++){
            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
        }
       
        int i = 0;
        int count = p.length();

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);
            
            if (hm.containsKey(c)) {
                if (hm.get(c) > 0) {
                    count--;
                }

                hm.put(c, hm.get(c) - 1);
            }
            if (j - i + 1 > p.length()) {

                char left = s.charAt(i);

                if (hm.containsKey(left)) {
                    if (hm.get(left) >= 0) {
                        count++;
                    }

                    hm.put(left, hm.get(left) + 1);
                }

                i++;
            }
            if (count == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
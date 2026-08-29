class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans =0;
        for(int i =0 ; i<words.length;i++){
            String curr = words[i];
            int l = curr.length();
            for(int j =i+1 ;j<words.length;j++){
                String next = words[j];
                if(next.length()>=l && curr.equals(next.substring(0,l)) && curr.equals(next.substring(next.length()-l))) ans++;
            }
        }
        return ans;
    }
}
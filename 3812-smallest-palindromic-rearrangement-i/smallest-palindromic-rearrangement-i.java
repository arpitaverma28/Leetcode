class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        for(int i =0;i<26;i++){
            if(freq[i]%2 ==1){
                mid.append((char)(i+'a'));
            }
            for(int j =0;j<freq[i]/2;j++){
                left.append((char)(i+'a'));
            }
        }
       StringBuilder right = new StringBuilder(left).reverse();
       return left.toString() + mid.toString() + right.toString();
    }
}
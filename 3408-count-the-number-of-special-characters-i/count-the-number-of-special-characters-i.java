class Solution {
    public int numberOfSpecialChars(String word) {
     boolean s[] = new boolean[26];
     boolean c[] = new boolean[26];
     for(char ch : word.toCharArray()){
        if(Character.isLowerCase(ch)) s[ch-'a'] = true;
        else c[ch-'A'] = true;
     }   
     int ans =0;
     for(int i=0;i<26;i++){
        if(s[i] && c[i]) ans++;
     }
     return ans;
    }
}
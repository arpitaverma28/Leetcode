class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int n = s.length();
        int l =0;
        int one=0;
       for(int r =0 ;r<n;r++){
         if(s.charAt(r)=='1') one++;
         while(one>k){
            if(s.charAt(l)=='1'){
            one--;
            }
              l++;
         }
         while(one ==k && s.charAt(l)=='0') l++;
         if(one ==k){
            String curr = s.substring(l,r+1);
            if(ans.isEmpty() ||
            ans.length()>curr.length() ||
            ans.length() == curr.length() && ans.compareTo(curr)>0){
                ans = curr;
            }
         }
       }
       return ans;
    }
}
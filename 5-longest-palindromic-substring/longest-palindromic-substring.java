class Solution {
    public String longestPalindrome(String s) {
        int n= s.length();
        if(n==0 || n==1) return s;
        String ans = "";
        
        int j=0;
        while(j<n){
            int a=j-1;
            int b = j+1;
            while(a>=0 && b <n && s.charAt(a) == s.charAt(b)){
                a--;
                b++;
            }
            int l =b-a-1;
            if(l>ans.length()){
                ans= s.substring(a+1,b);
            }
            a=j;
            b=j+1;
             while(a>=0 && b <n && s.charAt(a) == s.charAt(b)){
                a--;
                b++;
            }
             l =b-a-1;
            if(l>ans.length()){
                ans= s.substring(a+1,b);
            }
         j++;
        }
        return ans;
    }
}

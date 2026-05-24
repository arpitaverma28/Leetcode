class Solution {
    public int countSubstrings(String s) {

    int ans =0;
    for(int i =0;i<s.length();i++){
        int a=i;
        int b=i;
        while(a>=0 && b<s.length()){
            if(s.charAt(a) != s.charAt(b)) break;
            a--;
            b++;
           ans++ ;
        }
        
        a=i;
        b=i+1;
           while(a>=0 && b<s.length()){
            if(s.charAt(a) != s.charAt(b)) break;
            a--;
            b++;
            ans++;
        }
    }
    return ans;        
    }
}
class Solution {
    public int maxNumberOfBalloons(String text) {
        int a=0;
        int b=0;
        int l =0;
        int o=0;
        int n =0;
        for(char c : text.toCharArray()){
            if(c=='a')a++;
            else if(c=='b') b++;
            else if(c=='l') l++;
            else if(c == 'o') o++;
            else if(c == 'n')n++;
        }
        o /=2;
        l /=2;
       int  ans = Math.min(Math.min(a,b),Math.min(o,l));
        return Math.min(ans,n);
    }
}
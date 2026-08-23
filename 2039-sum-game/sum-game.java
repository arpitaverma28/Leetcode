class Solution {
    public boolean sumGame(String num) {
        int q1=0;
        int s1=0;
        int q2=0;
        int s2=0;
        int n = num.length();
        for(int i =0;i<n/2;i++){
            char c = num.charAt(i);
            if(c =='?') q1++;
            else s1 += c-'0';
        }
          for(int i =n/2;i<n;i++){
            char c = num.charAt(i);
            if(c =='?') q2++;
            else s2 += c-'0';
        }
       
      return (s1 - s2) * 2 != (q2 - q1) * 9; 
        
    }
}
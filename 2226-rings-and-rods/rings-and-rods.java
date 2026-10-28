class Solution {
    public int countPoints(String rings) {
        int n = rings.length();
        boolean dp[][] = new boolean[10][3];
        for(int i =0;i<n;i +=2){
            int ch = rings.charAt(i);
            int  j = rings.charAt(i+1) -'0';
            if(ch =='R') dp[j][0] = true;
            if(ch == 'B') dp[j][1] =true;
            if(ch == 'G') dp[j][2] =true;
          
        }
        int count =0;
        for(int i =0;i<10;i++){  
            if(dp[i][0] && dp[i][1] && dp[i][2])  count++;
        }
        return count;
    }
}
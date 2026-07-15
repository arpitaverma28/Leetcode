class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd =0;
        int even =0;
        for(int i=1;i<=2*n;i++){
            if(i%2 ==0) even +=i;
            else odd +=i;
        }
        int ans =1;
        for(int i =2;i<Math.min(odd,even);i++){
            if(odd%i==0 && even % i ==0) ans =i;
        }
        return ans;
    }
}
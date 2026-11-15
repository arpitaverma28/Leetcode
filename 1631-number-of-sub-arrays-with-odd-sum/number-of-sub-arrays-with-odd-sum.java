class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int odd =0;
        int even =1;
        long ans =0;
        int sum =0;
        for(int x : arr){
            sum = (sum +x) %2;
            if(sum ==1){
                ans = (ans+even) % mod;
                odd++;
            }else{
                ans = (ans+odd)%mod;
                even++;
            }
        }
        return (int)ans;
    }
}
class Solution {
    public long timeTaken(int k,int []nums){
        long ans =0;
        for(int i : nums){
            // ans += Math.ceil((double)i/h);
            ans += (i+k-1)/k;
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
     int n = piles.length;
     int high =0;
     for(int i :piles){
        high = Math.max(high,i);
     }
     int ans = high;
     int low =1;
     while(low<=high){
        int mid = low + (high-low)/2;
        long t = timeTaken(mid,piles);
        if(t<=h){
            ans =mid;
            high=mid-1;
        }else{
            low = mid+1;
        }
     }
     
       return ans; 
    }
}
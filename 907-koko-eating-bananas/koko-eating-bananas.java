class Solution {
    public int timeTaken(int h,int []nums){
        int ans =0;
        for(int i : nums){
             ans += Math.ceil((double)i/h);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
     int n = piles.length;
     int high = piles[0];
     for(int i =1;i<n;i++){
        if(piles[i]>high){
            high = piles[i];
        }
     }
     int ans = high;
     int low =1;
     while(low<=high){
        int mid = low + (high-low)/2;
        int t = timeTaken(mid,piles);
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
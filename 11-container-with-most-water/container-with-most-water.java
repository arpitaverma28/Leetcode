class Solution {
    public int maxArea(int[] h) {
        int ans =0;
        int i =0;
        int j = h.length-1;
        while(i<j){
            int water = (j-i)*Math.min(h[i],h[j]);
            if(h[i]<h[j]) i++;
            else j--;
            ans = Math.max(ans,water);
        }
        return ans;
    }
}
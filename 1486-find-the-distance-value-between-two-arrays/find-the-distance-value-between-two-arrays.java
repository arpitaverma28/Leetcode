class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int a1 =0;
        int ans =0;
        while(a1<arr1.length){
            int a2 =0;
            boolean isPossible = true;
            while(a2<arr2.length){
                if(Math.abs(arr1[a1]-arr2[a2]) <= d){
                    isPossible = false;
                    break;
                }
                a2++;
            }
            if(isPossible) ans++;
            a1++;
        }
        return ans;
    }
}
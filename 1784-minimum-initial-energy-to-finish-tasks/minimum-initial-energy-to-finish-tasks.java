class Solution {
    public boolean valid(int tasks[][],int mid){
     for(int i =0;i<tasks.length;i++){
        if(tasks[i][1]>mid) return false;
        mid = mid-tasks[i][0];
     }
     return true;
    }
    public int minimumEffort(int[][] tasks) {
        int n = tasks.length;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(tasks,(a,b)->{
            int diff1 = a[1]-a[0];
            int diff2 = b[1]-b[0];
            return diff2-diff1;
        });
        int sum =0;
        int max = 0;
        for(int i =0;i<n;i++){
             sum += tasks[i][1];
            max = Math.max(max,tasks[i][1]);
        }
       int low = max;
       int high = sum;
        while(low<=high){
            int mid = low +(high -low)/2;
            if(valid(tasks,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
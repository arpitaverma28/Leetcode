class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =1 ;i<=n;i++){
        int sum =0;
        int num = i;
        while(num>0){
            sum += num%10;
            num /=10;
        }
       hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
     int maxsize =0;
     for(int i : hm.values()){
        maxsize = Math.max(maxsize,i);
     }
     int ans =0;
     for(int i : hm.values()){
        if(i == maxsize) ans++;
     }
        return ans;
    }
}
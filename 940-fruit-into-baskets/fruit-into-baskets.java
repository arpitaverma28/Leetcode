class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i =0;
        for(int j=0;j<fruits.length;j++){
           hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);

           while(hm.size()>2){
            int f = hm.get(fruits[i]);
            if(f==1){
                hm.remove(fruits[i]);
            }else{
                hm.put(fruits[i],hm.get(fruits[i])-1);
            }
            i++;
           }
           int total =0;
           for(int k : hm.values()){
            total +=k;
           }
           ans = Math.max(ans,total);
        }
        return ans;
    }
}
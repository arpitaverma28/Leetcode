class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i : nums1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(hm.containsKey(i)){
                list.add(i);
                if(hm.get(i)==1){
                    hm.remove(i);
                }else{
                    hm.put(i,hm.get(i)-1);
                }
               
            }
        }
        int ans[] = new int[list.size()];
        for(int i =0;i<ans.length;i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
}
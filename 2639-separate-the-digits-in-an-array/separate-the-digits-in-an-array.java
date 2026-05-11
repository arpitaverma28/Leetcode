class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--){
            int curr = nums[i];
           while(curr != 0){
             int mod = curr%10;
             ans.add(0,mod);
             curr = curr/10;
           }
        }
       int arr[] = new int[ans.size()];
       for(int i =0;i<ans.size();i++){
        arr[i] = ans.get(i);
       }
       return arr;
    }
}
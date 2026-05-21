class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void helper(int []arr , int tar,int sum,int i,ArrayList<Integer> list){
        if(sum == tar){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>tar|| i>=arr.length) return;
        list.add(arr[i]);
        helper(arr,tar,sum+arr[i],i,list);
        list.remove(list.size()-1);
          helper(arr,tar,sum,i+1,list);
    }
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
          helper(arr,tar,0,0,new ArrayList<Integer>());
          return ans;
    }
}
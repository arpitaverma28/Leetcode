class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
         ArrayList<Integer> arr2 = new ArrayList<>(); 
        int n = nums.length;
        if(n<=2) return nums;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i =2;
        while(i<n){
            if(arr1.get(arr1.size() -1)> arr2.get(arr2.size() -1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
            i++;
        }
        int arr[] = new int[n];
       
        for( i =0;i<arr1.size();i++){
            arr[i]= arr1.get(i);
        }
        for( i =0;i<arr2.size();i++){
            arr[i+arr1.size()] = arr2.get(i);
        }
        return arr;
    }
}
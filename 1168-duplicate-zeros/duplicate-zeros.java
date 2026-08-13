class Solution {
    public void duplicateZeros(int[] arr) {
        int i =0;
        while(i<arr.length-1){
            if(arr[i]==0){
                int j = arr.length-1;
               while(i<j){
                arr[j]=arr[j-1];
                j--;
               }
               arr[i+1]=0;
               i++;
            }
            i++;
        }

        
    }
}
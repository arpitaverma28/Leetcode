class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans []=new int[A.length];
       int fre[] = new int[A.length+1];
       int count =0;
        for(int i=0;i<A.length;i++){
          fre[A[i]]++;
          if(fre[A[i]]==2) count++;
          fre[B[i]]++;
          if(fre[B[i]]==2) count++;
          ans[i]=count;
        }
        return ans;
    }
}
class Solution {
    public boolean allZero(int arr[]){
        for(int i =0;i<arr.length;i++){
            if(arr[i] !=0) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2) return false;
      int arr[] = new int[26];
        for(char c : s1.toCharArray()){
          arr[c-'a']++;
        }
        int i =0;
        for(int j =0;j<n2;j++){
            arr[s2.charAt(j)-'a']--;
        
        if(j-i+1>n1){
             arr[s2.charAt(i)-'a']++;
             i++;
          }

          if(allZero(arr)) return true;
        }
        return false;
    }
}
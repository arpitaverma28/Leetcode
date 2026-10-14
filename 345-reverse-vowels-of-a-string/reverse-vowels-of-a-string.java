class Solution {
    public boolean isVowel(char c){
         c = Character.toLowerCase(c);
        if( c=='a' || c == 'e' || c== 'i' || c== 'o' || c == 'u') return true;
        return false;
    }
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int l = 0;
        int r = arr.length -1;
        while(l<r){
            while(l<r && !isVowel(arr[l])) l++;
            while(l<r && !isVowel(arr[r])) r--;
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--; 
        }
        return new String(arr);
    }
}
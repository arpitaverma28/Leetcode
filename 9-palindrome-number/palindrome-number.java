class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = String.valueOf(x);
        int l =0;
        int h =s.length()-1;
        while(l<h){
            if(s.charAt(l) != s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
}
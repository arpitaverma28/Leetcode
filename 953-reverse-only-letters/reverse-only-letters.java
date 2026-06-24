class Solution {
    public String reverseOnlyLetters(String s) {
        int a =0;
        int b = s.length()-1;
        char arr[] =s.toCharArray();
        while(a<b){
            while(a<b && !Character.isLetter(arr[a]))a++;
            while(a<b && !Character.isLetter(s.charAt(b))){
                b--;
            } 
            if(a<b){
                char temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
    return   new String(arr);
    }
}
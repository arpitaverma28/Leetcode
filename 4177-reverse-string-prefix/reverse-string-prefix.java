class Solution {
    public String reversePrefix(String s, int k) {
        
        char c[] =s.toCharArray();
        int a =0;
        int b = k-1;
        while(a<b){
            char temp = c[a];
            c[a] = c[b];
            c[b]= temp;
            a++;
            b--;
        } 
        return new String(c);
        
    }
}
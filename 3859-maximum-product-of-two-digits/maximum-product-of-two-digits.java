class Solution {
    public int maxProduct(int n) {
        int a =0;
        int b =0;
        while(n !=0){
            int curr = n%10;
            if(curr >=a){
            b = a;
            a = curr;
            }else if(curr >b){
                b= curr;
            }
            n /=10;
        }
        return a*b;
    }
}
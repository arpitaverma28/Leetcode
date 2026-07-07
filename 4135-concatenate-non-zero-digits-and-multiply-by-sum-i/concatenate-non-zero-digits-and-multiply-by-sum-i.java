class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb =  new StringBuilder();
        while(n != 0){
          if(n%10 != 0)  sb.append(n%10);
            n /= 10;
        }
        sb.reverse();
       long dig =0;
       long sum =0;
       for(int i =0;i<sb.length();i++){
        sum += sb.charAt(i) -'0';
        dig = (dig*10) +(sb.charAt(i) - '0');
       }
       return sum*dig;
    }
}
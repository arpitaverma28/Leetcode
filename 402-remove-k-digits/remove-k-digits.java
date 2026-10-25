class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<num.length();i++){
            int x = num.charAt(i) -'0';
            while(!s.isEmpty() && k>0 && s.peek()>x){
                s.pop();
                k--;
            }
            s.push(x);
        }
        while(k>0 && !s.isEmpty()) {
            s.pop();
            k--;
            }
        StringBuilder sb = new StringBuilder();
       for(int i : s){
        sb.append(i);
       }
       int i =0;
       while(i<sb.length() && sb.charAt(i) =='0') {
        i++;
       }
       String ans = sb.substring(i);
        return ans.isEmpty()?"0" :ans;
        
    }
}
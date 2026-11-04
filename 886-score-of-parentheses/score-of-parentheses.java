class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int dep=0;
    
        for(char ch : s.toCharArray()){
            if(ch =='('){
                st.push(dep);
                 dep=0;
            }else{
                dep = st.pop() + Math.max(dep*2,1);
            }
        }
        return dep;
    }
}
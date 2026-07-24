class Solution {
    List<String> ans =new ArrayList<>();
    public void helper(int n ,int o,int c ,StringBuilder sb){
        if(sb.length() == 2*n){
          ans.add(new String(sb.toString()));
          return;
        }
        if(o<n){
            sb.append('(');
            helper(n,o+1,c,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
          sb.append(')');
          helper(n,o,c+1,sb);
          sb.deleteCharAt(sb.length() - 1);
        }
       

    }
    public List<String> generateParenthesis(int n) {
        helper(n,0,0,new StringBuilder() );
        return ans;
    }
}
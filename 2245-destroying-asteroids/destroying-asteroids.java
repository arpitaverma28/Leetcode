class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long curr = mass;
        for(int i =0;i<ast.length;i++){
            if(ast[i]>curr) return false;
            curr += ast[i];
        }
        return true;
    }
}
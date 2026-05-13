class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> s = new Stack<>();
        for(int num : as ){
           boolean des = false;
           while(!s.isEmpty() && s.peek()>0 && num<0){
             if(s.peek()< -num){
                s.pop();
             }else if(s.peek() == -num){
                s.pop();
                des=true;
                break;
             }else{
                des=true;
                break;
             }
           }
            if(!des) s.push(num);
        }
        int ans[] = new int[s.size()];
        int i =0;
        for(int j : s){
            ans[i++] =j;
        }
        return ans;
    }
}
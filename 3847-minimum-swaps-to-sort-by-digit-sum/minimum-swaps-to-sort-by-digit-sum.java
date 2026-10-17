class Solution {
    public int digSum(int i){
        int sum =0;
        while(i != 0){
            sum += i%10;
            i /= 10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        Integer sorted[] = new Integer[nums.length];
        for(int i =0;i<nums.length;i++) sorted[i] = nums[i];
        Arrays.sort(sorted,(a,b)->{
            int sa = digSum(a);
            int sb = digSum(b);
            if(sa != sb) return sa-sb;
            return a-b;
        });
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++) hm.put(nums[i],i);
        int ans =0;
        for(int i =0;i<nums.length;i++){
            int exp = sorted[i];
            int curr = nums[i];
            if(exp == curr) continue;
            int idx = hm.get(exp);
            nums[i] = exp;
            nums[idx] =curr;
            hm.put(exp,i);
            hm.put(curr,idx);
            ans++;
        }
       return ans; 
    }
}
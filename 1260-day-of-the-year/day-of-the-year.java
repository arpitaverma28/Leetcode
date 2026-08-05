class Solution {
    public boolean isLeap(int year){
        if(year % 400 == 0) return true;
        if(year % 100 ==0) return false;
        if(year % 4 == 0) return true;
        return false;
    }
    public int dayOfYear(String date) {
        String []s = date.split("-");
        int day = Integer.parseInt(s[2]);
        int month = Integer.parseInt(s[1]);
        int year =  Integer.parseInt(s[0]);
        boolean isLeap = isLeap(year);
        int [] days ={31,28,31,30,31,30,31,31,30,31,30,31};
        int ans =0;
        for(int i =0;i<month-1;i++){
            if(isLeap && i == 1){
                ans += 1;
            }
            ans += days[i];
        }
        return ans+day;
    }
}
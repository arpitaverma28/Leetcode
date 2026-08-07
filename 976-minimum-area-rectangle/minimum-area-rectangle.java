class Solution {
    public int minAreaRect(int[][] points) {
        HashMap<Integer,HashSet<Integer>> hm = new HashMap<>();
        for(int[]i : points){
            if(!hm.containsKey(i[0])){
                hm.put(i[0],new HashSet<Integer>());
            }
            hm.get(i[0]).add(i[1]);
        }
        int area = Integer.MAX_VALUE;
        for(int i =0;i<points.length;i++){
            for(int j =i+1;j<points.length;j++){
                int x1 = points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                if(x1 != x2 && y1 != y2){
                    if(hm.get(x2).contains(y1) && hm.get(x1).contains(y2)){
                        area = Math.min(area,Math.abs(x1-x2)*Math.abs(y1-y2));
                    }
                }
            }
        }
        return area==Integer.MAX_VALUE ? 0 : area;
    }
}
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int arr[][] = new int[n][m];
        k = k%(n*m);
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                int idx = i*m +j;
                int newIdx = (idx+k)%(n*m);
                arr[newIdx/m][newIdx%m] = grid[i][j];
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            List<Integer> l = new ArrayList<>();
            for(int j =0;j<m;j++){
                l.add(arr[i][j]);
            }
            list.add(l);
        }
       return list; 
    }
}
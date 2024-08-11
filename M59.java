package practise_app4;
//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
//Note: You can only move either down or right at any point in time.
//Example 1:
//Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
//Output: 7
//Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
//Example 2:
//Input: grid = [[1,2,3],[4,5,6]]
//Output: 12
public class M59 {
	public static void main(String[] args) {
		int[][] grid= {{1,3,1},{1,5,1},{4,2,1}};
		M59 obj = new M59();
		System.out.println(obj.minPathSum(grid));
	}
	public int minPathSum(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==0 && j==0){
                    continue;
                }
                else if(i==0){
                    grid[i][j]+=grid[i][j-1];
                }
                else if(j==0){
                    grid[i][j]+=grid[i-1][j];
                }
                else{
                    int value=Math.min(grid[i-1][j],grid[i][j-1]);
                    grid[i][j]+=value;
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}


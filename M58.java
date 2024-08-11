package practise_app4;
//Dynamic programming..
//You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
//An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
//Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//The testcases are generated so that the answer will be less than or equal to 2 * 109.
//Example 1:
//Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
//Output: 2
//Explanation: There is one obstacle in the middle of the 3x3 grid above.
//There are two ways to reach the bottom-right corner:
//1. Right -> Right -> Down -> Down
//2. Down -> Down -> Right -> Right
//Example 2:
//Input: obstacleGrid = [[0,1],[0,0]]
//Output: 1
public class M58 {
	public static void main(String[] args) {
		int [][] obstacleGrid= {{0,0,0},{0,1,0},{0,0,0}};
		M58 obj = new M58();
		System.out.println(obj.uniquePathsWithObstacles(obstacleGrid));
		
	}
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[i].length;j++){
                if(i==0|| j==0){
                    if(obstacleGrid[i][j]==1){
                        obstacleGrid[i][j]=0;
                    }
                    else{
                        if((i!=0 && obstacleGrid[i-1][j]==0) || (j!=0 && obstacleGrid[i][j-1]==0)){
                            obstacleGrid[i][j]=0;
                        }
                        else{
                            obstacleGrid[i][j]=1;
                        }
                        
                    }
                }
                else{
                    if(obstacleGrid[i][j]==1){
                        obstacleGrid[i][j]=0;
                    }
                    else{
                        obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                    }
                }
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
 
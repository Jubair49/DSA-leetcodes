package practise_app4;
//Dynamic programming



//There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
//Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//The test cases are generated so that the answer will be less than or equal to 2 * 109.
//Input: m = 3, n = 7
//Output: 28
//Example 2:
//
//Input: m = 3, n = 2
//Output: 3
//Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down
 
 


public class M56 {
	public static void main(String[] args) {
		int [][]array= new int[3][7];
		int m=array.length;
		int n=array[0].length;
		M56 obj = new M56();
		System.out.println(obj.uniquePaths(m,n));
	}
	public int uniquePaths(int m, int n) {
        int[][] array=new int[m][n];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==0 || j==0){
                    array[i][j]=1;
                }
                else{
                	
                    array[i][j]=array[i][j-1]+array[i-1][j];
                }
            }
        }
        return array[m-1][n-1];
    }
        
}
	


package practise_app4;
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
import java.util.Arrays;

public class M31 {
	public static void main(String[] args) {
		M31 obj = new M31();
		int[][] matrix= { {3,6,9,10},{11,12,13,14},{15,16,17,18}};
	
		System.out.println(obj.searchMatrix(matrix,500));
	}
	 public boolean searchMatrix(int[][] matrix, int target) {
		int m=matrix.length;
		int n=matrix[0].length;
		for(int i=0;i<m;i++) {
			if(target>=matrix[i][0] && target<=matrix[i][n-1]) {
				for(int j=0;j<n;j++) {
					if(matrix[i][j]==target) {
						return true;
						
					}
				}
			}
		}
		return false;
	 }
}
	 
	 
	 
	 
//	 int i=0; int j=matrix[0].length-1;
//     while(i<matrix.length && j>=0){
//         if(matrix[i][j]==target){
//             return true;
//         }
//         else if(target<matrix[i][j]){
//             j--;
//         }
//         else{
//             i++;
//         }
//     }
//     return false;
// }
package practise_app4;
//spiral matrix;
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
import java.util.Arrays;

public class M33 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(Arrays.toString(matrix));
		int rowStart=0;
		int rowEnd=matrix.length-1;
		int columStart=0;
		int columEnd=matrix[0].length-1;;
		while(rowStart<=rowEnd && columStart<=columEnd) {
			for(int j=columStart;j<=columEnd;j++) {
				System.out.print(matrix[rowStart][j]+",");
			}
			rowStart++;
			
			for(int  j=rowStart;j<=rowEnd;j++) {
				System.out.print(matrix[j][columEnd]+",");
			}
			columEnd--;
			
			if(rowStart<=rowEnd) {
				for(int j=columEnd;j>=columStart;j--) {
					System.out.print(matrix[rowEnd][j]+",");
				}
			}
			rowEnd--;
			if(columStart<=columEnd) {
				for(int j=rowEnd;j>=rowStart;j--) {
					System.out.print(matrix[j][columStart]+",");
				}
			}
			columStart++;
		}
		//System.out.println(Arrays.toString(matrix));
	}

}
				
		
	

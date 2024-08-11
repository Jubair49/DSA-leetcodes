package practise_app4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M34 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		M34 obj=new M34();
		System.out.println(obj.spiralOrder(matrix));
	}
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list=new ArrayList<Integer>();
		int rowStart=0;
		int rowEnd=matrix.length-1;
		int columStart=0;
		int columEnd=matrix[0].length-1;;
		while(rowStart<=rowEnd && columStart<=columEnd) {
			for(int j=columStart;j<=columEnd;j++) {
				list.add(matrix[rowStart][j]);
			}
			rowStart++;
			
			for(int  j=rowStart;j<=rowEnd;j++) {
				list.add(matrix[j][columEnd]);
			}
			columEnd--;
			
			if(rowStart<=rowEnd) {
				for(int j=columEnd;j>=columStart;j--) {
					list.add(matrix[rowEnd][j]);
				}
			}
			rowEnd--;
			if(columStart<=columEnd) {
				for(int j=rowEnd;j>=rowStart;j--) {
					list.add(matrix[j][columStart]);
				}
			}
			columStart++;
		}
		return list;
	}
}

	
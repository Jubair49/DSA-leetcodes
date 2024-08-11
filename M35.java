package practise_app4;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class M35 {
	public static void main(String[] args) {
		M35 obj=new M35();
		int[][] n= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(obj.generateMatrix(3)));
		//System.out.println(Arrays.toString(n));
	}
	public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int rowStart=0;
		int rowEnd=n-1;
		int columStart=0;
		int columEnd=n-1;;
        int value=1;
		while(rowStart<=rowEnd && columStart<=columEnd) {
			for(int j=columStart;j<=columEnd;j++) {
				result[rowStart][j]=value;
                value++;
                
			}
			rowStart++;
			
			for(int  j=rowStart;j<=rowEnd;j++) {
				result[j][columEnd]=value;
                value++;
                

			}
			columEnd--;
			
			if(rowStart<=rowEnd) {
				for(int j=columEnd;j>=columStart;j--) {
				    result[rowEnd][j]=value;
                    value++;
                    

				}
			}
			rowEnd--;
			if(columStart<=columEnd) {
				for(int j=rowEnd;j>=rowStart;j--) {
					result[j][columStart]=value;
                    value++;
                    
				}
			}
			columStart++;
		}
		return result;
	}
}



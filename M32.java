package practise_app4;
//pascal traiagele........
import java.util.Arrays;

public class M32 {
	public static void main(String[] args) {
		int i=0;
		int[][]results=new int [8][];
		int[]rows= {1};
		results[i++]=rows;
		int[]prevRow=rows;
		for(i=1;i<8;i++) {
			rows = new int[i+1];
			rows[0]=1;
			for(int j=1;j<i;j++) {
				rows[j]=prevRow[j-1]+prevRow[j];
				
				
			}
			rows[rows.length-1]=1;
			results[i]=rows;
			prevRow=rows;
		}
		for( i=0;i<results.length;i++) {
			System.out.println(Arrays.toString(results[i]));
		}
	}
}
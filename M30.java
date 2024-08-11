package practise_app4;
//pascal traiangle......
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M30 {
	public static void main(String[] args) {
		int rows=5;
		M30 obj = new M30();
		System.out.println(obj.generate(5));
	}
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		
		ArrayList<Integer> row =new ArrayList<Integer>();
		row.add(1);
		result.add(row);
		ArrayList<Integer> preRow=row;
		for(int i=1;i<numRows;i++) {
			row=new ArrayList<Integer>();
			row.add(1);
			for(int j=1;j<i;j++) {
				row.add(preRow.get(j-1)+preRow.get(j));
				
			}
			
			row.add(1);
			result.add(row);
			preRow=row;
		}
		return result;
	}

}

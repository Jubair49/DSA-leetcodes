package practise_app4;
//daily temperatures.
import java.util.ArrayList;

public class M23 {
	public static void main(String[] args) {
		int[]temparatures= {98,97,99,92,99,98,97,100,92,101,93};
		ArrayList<ArrayList<Integer>> result=warmerTemparatures(temparatures);
		System.out.println(result);
	}
	 static ArrayList<ArrayList<Integer>>warmerTemparatures(int[]temparatures){
		 ArrayList<ArrayList<Integer>> result=new  ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> warmerTemperatures=null;

		 for(int i=0;i<temparatures.length;i++) {
			 warmerTemperatures=new ArrayList<Integer>();
			 result.add(warmerTemperatures);
			 for(int j=i+1;j<temparatures.length;j++) {
				 if(temparatures[i]<temparatures[j]) {
					 warmerTemperatures.add(temparatures[j]);
				 }
			 }
		 }
		 return result;
	 }
}
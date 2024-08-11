package practise_app4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class M42 {
	public static void main(String[] args) {
		int[]nums= {2,7,11,15};
		System.out.println(Arrays.toString(nums));
		M42 obj = new M42();
		System.out.println(obj.threeSum(nums));
	}
	HashSet<ArrayList<Integer>> set=new HashSet<ArrayList<Integer>>();
	public List<List<Integer>> threeSum(int[] nums) {
		int target=24;
		int k;
		for(int i=0;i<nums.length;i++) {
			k=target-nums[i];
			twoSum(nums,k,i+1);
		}
		List<List<Integer>> list= new ArrayList<List<Integer>>();
		list.addAll(set);
		return list;
	}
		
			
			
		

	public void  twoSum(int[]nums,int target,int from){
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=from;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(nums[i]);
				list.add(target-nums[i]);
				list.add(nums[from-1]);
				Collections.sort(list);
				set.add(list);
				
			}
			map.put(nums[i], i);
			
		}
	}
	
}
		
		
		
		
		
		
		
		
		
	
//		List<Integer> result=new ArrayList<Integer>();
//		int target=24;
//		int sum=9;
//		
//		//int[] result= {-1,-1,-1};
//		int  total;
//			
//		int add;
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		for(int i=0;i<nums.length;i++) {
//			if(list.contains(sum-nums[i])) {
//				total=nums[i]+sum-nums[i];
//				break;
//				
//			}
//			list.add(nums[i]);
//		}
//		ArrayList<Integer> list1=new ArrayList<Integer>();
//		for(int i=0;i<nums.length;i++) {
//			if(list1.contains(target-total)) {
//				
//				result.add(nums[i]);
//				
//			
//			}
//			list1.add(nums[i]);
//		}
//	}
//}
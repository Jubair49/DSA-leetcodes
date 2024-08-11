package practise_app4;

import java.util.Arrays;
import java.util.HashMap;

public class M41 {
	public static void main(String[] args) {
		int[]nums= {2,7,11,15};
		System.out.println(Arrays.toString(nums));
		M41 obj = new M41();
		System.out.println(Arrays.toString(obj.twoSum(nums,24)));
	}
	
	public int[] twoSum(int[] nums, int target) {
		
		int []result= {-1,-1,-1};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				result[0]=i;
				result[1]=map.get(target-nums[i]);
				
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
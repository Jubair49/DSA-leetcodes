package practise_app4;

import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class M3 {
	public static void main(String[] args) {
		M3 obj = new M3();
		int[] nums= {2,10,11,15};
		System.out.println(Arrays.toString(obj.sumNum(nums)));
	}
	public int[] sumNum(int[] nums) {
		int[]result= {-1,-1};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int target=12;
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				result[0]=i;
				result[1]=map.get(target-nums[i]);
				break;
			}
			map.put(nums[i], i);

		}
		return result;
	}
	
}
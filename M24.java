package practise_app4;

import java.util.Arrays;

public class M24 {
	public static void main(String[] args) {
		int[] nums= {4,7,1,5,9,-8,5};
		System.out.println(maxProductOfNumber(nums));
	}
	static int maxProductOfNumber(int[]nums) {
		Arrays.sort(nums);
		int max1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]*nums[nums.length-1];
		int max2=nums[0]+nums[1]+nums[nums.length-1]*nums[nums.length-2];
		int max3=nums[0]+nums[1]+nums[3]+nums[4];
		max1=Math.max(max1, max2);
		max3=Math.max(max1, max3);
		return max3;
	}
}
		

package practise_app4;
//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: 6
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: 24
//Example 3:
//
//Input: nums = [-1,-2,-3]
//Output: -6

import java.util.Arrays;


public class M15 {
	public static void main(String[] args) {
		int[] nums= {2,5,3,1,6,4,0};
		int[] nums1= {2,5,3,1,6,4,6};
		M15 obj=new M15();
		System.out.println(obj.maximumProduct(nums));
		System.out.println(obj.maximumProduct(nums1));
		
	}
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int product1=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
		int product2=nums[0]*nums[1]*nums[nums.length-1];
		int maxProduct=Math.max(product1, product2);
		return maxProduct;
		
	}

}
package app1;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//Input: nums = [0]
//Output: [0]
 
public class moveZeros {
	public static void main(String[] args) {
		int[]nums= {0,1,0,3,12};
		System.out.println(Arrays.toString(moveZeroes(nums)));
		
	}
	public static int[] moveZeroes(int[] nums) {
		int i=0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=0) {
				nums[i]=nums[j];
				i++;
			}
		}
		for(int k=i;k<nums.length;k++) {
			nums[k]=0;
		}
		return nums;
	}
}

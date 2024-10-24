package app1;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
// must write an algorithm with O(log n) runtime complexity.
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]
 
public class searchingElmene {
	public static void main(String[] args) {
		int[]nums= {5,7,7,8,8,10};
		//int target=8;
		System.out.println(Arrays.toString(searchRange(nums,69)));
	}
	public static int[] searchRange(int[] nums, int target) {
		int[]arr= new int[2];
		arr[0]=arr[1]=-1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				arr[0]=i;
				while(i<nums.length && nums[i+1]==target) {
					i++;
					
					arr[1]=i;
					break;
				}
			}
		}
		return arr;
	}
}
		/*if(nums.length==0) {
			return new int[] {-1,-1};
			
		}
		int[]result= new int[2];
		
		int low=0;
		int high=nums.length-1;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(nums[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		if(nums[low]!=target) {
			return new int[] {-1,-1};
			
		}
		result[0]=low;
		high=nums.length;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(nums[mid]<=target) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		result[1]=low-1;
		return result;*/
	
	
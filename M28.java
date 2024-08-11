package practise_app4;

import java.util.Arrays;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class M28 {
	public static void main(String[] args) {
		int []nums= {1,3,5,6};
		M28 obj = new M28();
		System.out.println(Arrays.toString(nums));
		System.out.println("search 4:"+obj.searchInsert(nums,4));  
		System.out.println("search 2:"+obj.searchInsert(nums,2));
		System.out.println("search 5:"+obj.searchInsert(nums,5));
		System.out.println("search 6:"+obj.searchInsert(nums,1));
	}
	public int searchInsert(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		int mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(target > nums[mid]) {
				left=mid+1;

				
			}
			else {
				right=mid-1;
			}
			
		}
		return left;
	}
}
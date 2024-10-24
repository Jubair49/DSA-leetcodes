package app1;
//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/submissions/1395330042/
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//Example 2:
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
public class binarySearch {
	public static void main(String[] args) {
		int[]nums= {-1,0,3,5,9,12};
		int target=9;

		System.out.println(search(nums,9));
	}
	public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        if(nums[low]==target){
            return low;
        }
        else{
            return -1;
        }
    }
}



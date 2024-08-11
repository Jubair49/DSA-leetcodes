package practise_app4;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Example 1:
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//Example 2:
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//Example 3:
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//import string_app3.M14;

public class M14 {
	public static void main(String[] args) {
		M14 obj=new M14();
		int[]nums= {0,1,2,4};
		System.out.println(obj.missingNumber(nums));
	}
		public int missingNumber(int[] nums) {
			int actualSum=0;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<nums.length;i++) {
				actualSum+=nums[i];
				if(max<nums[i]) {
					max=nums[i];
				}
			}
			int naturalSum=max*(max+1)/2;
			
			int diff=naturalSum-actualSum;
//			int missedNum = diff!=0 ? diff:(max!=nums.length ? (max+1) : diff);
//			return missedNum;
			int missedNum=0;
			if(diff!=0) {
				missedNum=diff;
			}
			else if(max!=nums.length) {
				missedNum=max+1;
			}
			return missedNum;
		}
}
		
package practise_app4;

import java.util.Arrays;

//Input: nums = [3,2,1,4]
//Output: 2
//Explanation: In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.
//Example 2:
//
//Input: nums = [1,2]
//Output: -1
//Explanation: Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.
//Example 3:
//
//Input: nums = [2,1,3]
//Output: 2
//Explanation: Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer. 
public class M17 {
	public static void main(String[] args) {
		int[] nums= {1,2};
		M17 obj = new M17();
		System.out.println(obj.minOrMax(nums));
	}
	public int minOrMax(int[]nums) {
		Arrays.sort(nums);;
		if(nums.length<=2) {
			return-1;
		}
		Arrays.sort(nums);;
	    return nums[1];
	}
}
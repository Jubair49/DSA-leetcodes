package practise_app4;
//Given a binary array nums, return the maximum number of consecutive 1's in the array
//Example 1:
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//Input: nums = [1,0,1,1,0,1]
//Output: 2
//Constraints:
public class M39 {
	public static void main(String[] args) {
		int[]nums= {1,1,0,1,1,1,0,0,1,1,};
		
		M39 obj=new M39();
		System.out.println(obj.findMaxConsecutiveOnes(nums));
		
		
	}
	public int findMaxConsecutiveOnes(int[] nums) {
		int count=0;
		int max=0;
		for(int i=0;i<nums.length;i++) {
				
			if(nums[i]==1) {
				count++;
			}
			else {
				max=Math.max(max, count);
				count=0;
			}
		}
		max=Math.max(max, count);
		return max;
	}
}
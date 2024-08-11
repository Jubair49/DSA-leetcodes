package practise_app4;
//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's
//Example 1:
//Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//Output: 6
//Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
//Example 2:
//Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//Output: 10
//Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
public class M40 {
	public static void main(String[] args) {
		int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
		M40 obj = new M40();
		System.out.println(obj.longestOnes(nums,2));
		
		
	}
	public int longestOnes(int[] nums, int k) {
		int max=0;
		int i=0;
		int p=0;
		int count=0;
		for(  i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				count++;
			}
			if(count<=k) {
				max=Math.max(max, i-p+1);
			}
			else {
				while(count>k) {
					if(nums[p]==0) {
						count--;
					}
					p++;
				}
			}
		}
		
		max=Math.max(max, i-p);
		return max;
	}
}

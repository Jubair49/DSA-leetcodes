package practise_app4;

import java.util.Arrays;

//**one plus**...........
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
public class M27 {
	public static void main(String[] args) {
		int[] nums= {1,5,2};
		int[] nums1= {9};
		System.out.println(Arrays.toString(plusOne(nums)));
		System.out.println(Arrays.toString(plusOne(nums1)));
	}
	static int[] plusOne(int[] nums) {
//		for(int i=digits.length-1;i>=0;i--) {
//			if(digits[i]<9) {
//				digits[i]=digits[i]+1;
//				return digits;
//			}
//			digits[i]=0;
//		}
//		int[] array=new int[digits.length+1];
//		array[0]=1;
//		return array;
//	}
//}
		//int left=nums.length;
		for( int i=nums.length-1; i>=0; i--) {
			if(nums[i]<9) {
				nums[i]++;
				return nums;
			}
			nums[i]=0;
			
		}
		int[] newNumber = new int[nums.length+1];
		newNumber[0]=1;
		return newNumber;
	}
}
package practise_app4;

import java.util.Arrays;

//import string_app3.M19;

//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//Example 2:
//
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
public class M16 {
	public static void main(String[] args) {
		M16 obj =new M16();
		int[] nums= {1,1,1,1,2,2,2,4,8,9};
		System.out.println(Arrays.toString(nums));
		nums=obj.removeDuplicates(nums);
	   System.out.println(Arrays.toString(nums));
		//System.out.println(nums);
	}
	public int[] removeDuplicates(int[] nums) {
		int i=0;
		int j=0;
		for(j=0;j<nums.length;j++) {
			if( nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
				
			}
		}
		int[] result=new int[i+1];
		for( j=0;j<result.length;j++) {
			result[j]=nums[j];
		}
		return result;
	}
}
	

package practise_app4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Given two integer arrays nums1 and nums2, return an array of their 
//intersection
//Each element in the result must be unique and you may return the result in any order.
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
public class M4 {
	public static void main(String[] args) {
		M4 obj = new M4();
		int []nums= {1,2,2,1};
		int []nums2= {2,2};
		int[] commonElements=obj.intersection(nums,nums2);
		System.out.println(Arrays.toString(commonElements));
	}
	public int[] intersection(int[] nums,int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], 1);
		}
		ArrayList<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<nums2.length;i++) {
			if(map.containsKey(nums2[i])) {
				list.add(nums2[i]);
				map.remove(nums2[i]);
			}
		}
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++){
			result[i]=list.get(i);
		}		
		return result;
	}
	
}
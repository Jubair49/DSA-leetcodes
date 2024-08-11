package practise_app4;
////Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M5 {
	public static void main(String[] args) {
		M5 obj = new M5();
		int []nums= {1,2,2,1};
		int []nums2= {2,2};
		int[] commonElements=obj.intersect(nums,nums2);
		System.out.println(Arrays.toString(commonElements));
	}
	public int[] intersect(int[] nums,int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		ArrayList<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<nums2.length;i++) {
			if(map.containsKey(nums2[i])) {
				
				list.add(nums2[i]);
				if(map.get(nums2[i])>1) {
					map.put(nums2[i], map.get(nums2[i])-1);
				}
				else {
					map.remove(nums2[i]);
				}
			}
		}
		int[] result = new int[list.size()];
		for( int  i=0;i<result.length;i++){
			result[i]=list.get(i);
		}		
		return result;
	}
}
	
	
	


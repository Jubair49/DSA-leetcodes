package practise_app4;
//Input: nums = [3,1,4,1,5], k = 2
//Output: 2
//Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
//Although we have two 1s in the input, we should only return the number of unique pairs.
//Example 2:
//Input: nums = [1,2,3,4,5], k = 1
//Output: 4
//Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
//Example 3:
//Input: nums = [1,3,1,5,4], k = 0
//Output: 1
//Explanation: There is one 0-diff pair in the array, (1, 1).
//Constraints:
import java.util.HashMap;
import java.util.Map;

public class M44 {
	public static void main(String[] args) {
		int[]nums= {3,7,4,1,5};
		M44 obj =new M44();
		System.out.println(obj.findPairs(nums,2));
	}
	public int findPairs(int[] nums, int k) {
		HashMap<Integer, Integer> map =new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}
		int count=0;
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(k==0) {
				if(entry.getValue()>1){
					count++;
				}
			}
			else {
				int otherNum=k + entry.getKey();
				if(map.containsKey(otherNum)) {
					System.out.println(k+" "+entry.getKey());
				count++;
				}
			}
		}
		return count;
	}
}	
package practise_app4;
//pr
import java.util.Arrays;

public class M29 {
	public static void main(String[] args) {
		int[] nums= {1,2,6,9,10,12};
		M29 obj = new M29();
		System.out.println(obj.selectInsert(nums,10));
	}
	static int selectInsert(int[]nums,int target) {
		//Arrays.sort(nums);
		int mid;
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(target>nums[mid] ) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return left;
	}
	
}
package practise_app4;
//min count of 1 consecutives................
public class M25 {
	public static void main(String[] args) {
		int[] nums= {1,1,0,1,0,1,1,1,5};
		int[] nums1= {0,0,0,0,0,0,0,0};
		System.out.println(consecutiveOnes(nums));
		System.out.println(consecutiveOnes(nums1));
	}
	static  int consecutiveOnes(int[] nums) {
		 int count=0;
		 int minCount=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count++;
			}
			else {
				if(count!=0) {
					minCount=Math.min(minCount, count);
				}
				count=0;
			}
		}
			
		if(count!=0) {
			minCount = Math.min(minCount, count);
		}	
		minCount=(minCount==Integer.MAX_VALUE)? 0:minCount;
		return minCount;
	}
	
}
	

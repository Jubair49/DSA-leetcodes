package app1;
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.
//Example 1:
//Input: arr = [0,1,0]
//Output: 1
//Example 2:
//Input: arr = [0,2,1,0]
//Output: 1
//Example 3:
//Input: arr = [0,10,5,2]
//Output: 1
//Binary search
public class peekMountain {
	public static void main(String[] args) {
		int []arr= {1,2,3,8,6,2,3};
		System.out.println(peakIndexInMountainArray(arr));
	}
	public static  int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int high=arr.length-1;
        while(l<high){
            int mid=l+(high-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                high=mid;
            }
        }
        return l;
    }
}
//linear search		int i=0;
//		while(arr[i]<arr[i+1]) {
//			i++;
//		}
//		return i;
//	}
//}


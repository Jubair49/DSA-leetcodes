package app1;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//Example 1:
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class majorityElment {
	public static void main(String[] args) {
		int[]nums= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
		
	}
	public static int majorityElement(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])){
				map.put(nums[i],map.get(nums[i])+1);
				
			}
			else {
				map.put(nums[i],1);
			}
			if(map.get(nums[i])>nums.length/2) {
				return nums[i];
			}
		}
		return -1;
	}
}/*
			}
				
			}
		for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
			if(entry.getValue()>nums.length/2) {
				return entry.getKey();
			}
		}
	     return -1;
	}
}
		/*int count=0;
		int vote=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				vote=nums[i];
			}
			else if(vote==nums[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		*/
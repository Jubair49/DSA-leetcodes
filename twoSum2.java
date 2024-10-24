package app1;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum2 {
	public static void main(String[] args) {
		int[] numbers= {2,8,7,15};
		System.out.println(Arrays.toString(twoSum(numbers,9)));
	}
	public static int[] twoSum(int[] numbers, int target) {
        int[]result={-1,-1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                result[1]=i+1;
                result[0]=map.get(target-numbers[i])+1;
                break;



            }
            map.put(numbers[i],i);

        }
        return result;
    }
}
        
        /*int[]result={-1,-1};

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }

            }
        }
        return result;
    }
}*/
   
        /*int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                break;
            }
        }
        return new int[]{left+1,right+1};*/
   
	

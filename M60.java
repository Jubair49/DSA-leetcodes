package practise_app4;
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Example 1:
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
public class M60 {
	public static void main(String[] args) {
		int n=5;
		M60 obj = new M60();
		System.out.println(obj.climbStairs(n));
		
	}
	public int climbStairs(int n) {//by using array we can solve this problem
        if(n<=2){
        	
            return n;
        }
        int[] ways= new int[n];
        ways[0]=1;
        ways[1]=2;
        for(int i=2;i<n;i++) {
        	ways[i]=ways[i-1]+ways[i-2];
        }
         
        return ways[n-1];
        
	}
}
	
//	public int climbStairs(int n) {//by using fibonnaci number also get the answer...
//        if(n<=3){
//            return n;
//        }
//        else {
//        	return climbStairs(n-1)+climbStairs(n-2);
//        }
//        
//	}
//}

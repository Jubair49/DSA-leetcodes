package app1;

public class wipro1 {
	public static void main(String[] args) {
		int input1=3521;
		int input2=2452;
		int input3=1352;
		System.out.println(findMax(input1,input2,input3));
	}
	public static int findMax(int num1,int num2,int num3) {
		int x=num1/1000%10;
		int y=num2/100%10;
		int largest=max(num3);
		int key=(x*y)-largest;
		return key;
	}
	private static int max(int num3) {
		int largest=0;
		while(num3>0) {
			int digit=num3%10;
			if(digit>largest) {
				largest=digit;
			}
			num3=num3/10;
		}
		return largest;
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int[] thousands = {num1 / 1000 % 10, num2 / 1000 % 10, num3 / 1000 % 10};
        int[] hundreds = {num1 / 100 % 10, num2 / 100 % 10, num3 / 100 % 10};
        int[] tens = {num1 / 10 % 10, num2 / 10 % 10, num3 / 10 % 10};
        int[] units = {num1 % 10, num2 % 10, num3 % 10};
        
        // Calculate the largest and smallest digits for each place
        int largestThousand = max(thousands);
        int smallestThousand = min(thousands);
        int largestHundred = 
        		max(hundreds);
        int smallestHundred = min(hundreds);
        int largestTen = max(tens);
        int smallestTen = min(tens);
        int largestUnit = max(units);
        int smallestUnit = min(units);
        
        // Form the key
        int key= (largestThousand - smallestThousand)*1000 + (largestHundred - smallestHundred)*100 +(largestTen - smallestTen)*10 +  (largestUnit - smallestUnit);
        return key;
	}
	private static int max(int[] array) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}return max;
	}
	private static int min(int[] array) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}return min;
	}
}*/

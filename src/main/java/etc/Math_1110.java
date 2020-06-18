package etc;

import java.util.Scanner;

public class Math_1110 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int targetN = sc.nextInt();
		int compareN = targetN;
		int cycleCount = 0;
		
		while(true) {
			int a, b;
			if(targetN < 10) 
				a = 0;
			else 
				a = targetN / 10;
			b = targetN % 10;
			
			int newN = a + b;
			targetN = (b * 10) + (newN % 10);
					
			cycleCount++;
			if(targetN == compareN)
				break;
		}
		System.out.println(cycleCount);
	}
}

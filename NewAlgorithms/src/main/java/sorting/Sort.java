package sorting;

import java.util.Vector;

public class Sort {
	
	public static Vector<Integer> getRandomArray(int length) {
		double rValue;
		int rNum;
		Vector<Integer> arr = new Vector<Integer>();
		for(int i=0;i<length; i++) {
			rValue = Math.random();
			rNum = (int) (rValue * length) + 1;
			
			arr.add(rNum);
		}
		
		return arr;
	}
	public static Vector<Integer> getRandomArrayNoD(int length) {
		double rValue;
		int rNum;
		Vector<Integer> arr = new Vector<Integer>();
		for(int i=0;i<length; i++) {
			do {
				rValue = Math.random();
				rNum = (int) (rValue * length) + 1;
			} while(arr.contains(rNum));
			arr.add(rNum);
		}
		
		return arr;
	}
}

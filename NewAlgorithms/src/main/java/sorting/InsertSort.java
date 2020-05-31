package sorting;

import java.util.Collections;
import java.util.Vector;

public class InsertSort {
	public Vector<Integer> doAscending(Vector<Integer> arr){
		int size = arr.size();
		
		for(int i=1;i<size;i++) {
			int keyValue = arr.get(i);
			int j;
			for(j=i-1;j>-1;j--) {
				arr.set(j+1, arr.get(j));
				if(keyValue <arr.get(j))
					break;
			}
			arr.set(j+1, keyValue);
		}
		
		/*
		for(int i=1;i<size;i++) {
			int keyValue = arr.get(i);
			int j = i - 1;
			while(j >= 0 && arr.get(j) > keyValue) {
				arr.set(j + 1, arr.get(j));
				j--;
			}
			arr.set(j + 1, keyValue);
		}
		 */
		return arr;
	}
}

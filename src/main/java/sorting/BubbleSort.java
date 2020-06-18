package sorting;

import java.util.Collections;
import java.util.Vector;

public class BubbleSort {
	public Vector<Integer> doAscending(Vector<Integer> arr){
		int size = arr.size();
		for(int i=0; i<size;i++) {
			for(int j=1;j<size-i;j++) {
				if(arr.get(j) < arr.get(j-1))
					Collections.swap(arr, j, j-1);
			}
		}
		
		return arr;
	}
}

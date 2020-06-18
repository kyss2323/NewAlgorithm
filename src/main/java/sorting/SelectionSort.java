package sorting;
import java.util.*;
public class SelectionSort {
	public Vector<Integer> doAscending(Vector<Integer> arr) {
	
		int size = arr.size();
		
		for(int i=0;i < size;i++) {
			int index = i;
			for(int j = i; j < size;j++) {
				if(arr.get(index) > arr.get(j))
					index = j;
			}
			Collections.swap(arr, i, index);
		}
		
		return arr;
	}
	
}

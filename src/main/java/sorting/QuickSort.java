package sorting;

import java.util.Collections;
import java.util.Vector;
public class QuickSort {
	public void quickSort(Vector<Integer> v, int s, int e) {
		int pivot = v.get(s);
		int bs = s, be = e;
		
		while(s < e) {
			while(pivot <= v.get(e) && s < e) e--;
			if(s > e) break;
			while(pivot >= v.get(s) && s < e) s++;
			if(s > e) break;
			
			Collections.swap(v, s, e);
		}
		Collections.swap(v, bs, s);
		if(bs < s) quickSort(v, bs, s-1);
		if(be > e) quickSort(v, s+1, be);
		
	}
}

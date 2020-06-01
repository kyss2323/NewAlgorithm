package sorting;
import java.util.Vector;

public class MergeSort {
	
	public void mergeSort(Vector<Integer> v, int s, int e) {
		if(s < e) {
			int m = (s + e) / 2;
			mergeSort(v, s, m);
			mergeSort(v, m+1, e);
			merge(v, s, m, e);
		}
	}

	private void merge(Vector<Integer> v, int s, int m, int e) {
		int i = s;
		int j = m + 1;
		int copy = 0;
		Vector<Integer> ref = new Vector<>();
		
		while(i <= m && j <= e) {
			if(v.get(i) < v.get(j)) 
				ref.add(v.get(i++));
			else
				ref.add(v.get(j++));
		}
		
		while(i <= m)
			ref.add(v.get(i++));
		while(j <= e)
			ref.add(v.get(j++));
		
		for(int k = s; k <= e; k++) 
			v.set(k, ref.get(copy++));
		
	}
	
}

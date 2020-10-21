package sorting;

import java.util.Collections;
import java.util.List;
import java.util.Vector;
public class QuickSort {
	public void quickSort(List<Integer> arr, int s, int e){
        int left = s;
        int right = e;
        int pivot = arr.get((s+e)/2);

        while (left<=right){
            while (arr.get(left) < pivot) left++;
            while (arr.get(right) > pivot) right--;
            if(left <= right)
                Collections.swap(arr,left++,right--);
        }

        if(s<right)
            quickSort(arr, s, right);
        if(e>left)
            quickSort(arr, left, e);
    }
}

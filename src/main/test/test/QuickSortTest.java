package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import sorting.QuickSort;
import sorting.Sort;

class QuickSortTest {

	@Test
	void testQuickSort() {
		int length = 10;
		
		//Vector<Integer> v = Sort.getRandomArrayNoD(length);
		Vector<Integer> v = new Vector<>();
		QuickSort qs = new QuickSort();
		{
			v.add(4);
			v.add(3);
			v.add(7);
			v.add(5);
			v.add(2);
			v.add(8);
			v.add(1);
			v.add(6);
			
		}
		System.out.println("Before : " + v.toString());
		qs.quickSort(v, 0, 7);
		System.out.println("After  : " + v.toString());
		
	}

}

package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import sorting.SelectionSort;
import sorting.Sort;

class SelectionSortTest {

	@Test
	void testDoAscending() {
		Vector<Integer> arr = Sort.getRandomArray(10);
		SelectionSort s = new SelectionSort();
		
		System.out.println(String.format("Before : %s", arr.toString()));
		s.doAscending(arr);
		System.out.println(String.format("after  : %s", arr.toString()));
	}

}

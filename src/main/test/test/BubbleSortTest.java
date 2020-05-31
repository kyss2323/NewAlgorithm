package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import sorting.BubbleSort;
import sorting.Sort;

class BubbleSortTest {

	@Test
	void testDoAscending() {
		int length = 10;
		Vector<Integer> arr = Sort.getRandomArrayNoD(length);
		
		BubbleSort bs = new BubbleSort();
		System.out.println("Before : " + arr);
		arr = bs.doAscending(arr);
		System.out.println("After  : " + arr);
		
	}

}

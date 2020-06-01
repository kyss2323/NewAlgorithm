package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sorting.MergeSort;

import java.util.Vector;
class MergeSortTest {

	@Test
	void testMergeSort() {
		int length = 10;
		Vector<Integer> v = sorting.Sort.getRandomArrayNoD(length);
		MergeSort ms = new MergeSort();
		
		System.out.println(v);
		ms.mergeSort(v, 0, length-1);
		System.out.println(v);
	}

}

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import sorting.InsertSort;
import sorting.Sort;

class InsertSortTest {

	@Test
	void testDoAscending() {
		int length = 10;
		Vector arr = Sort.getRandomArrayNoD(length);
		
		InsertSort sortByInsert = new InsertSort();
		
		System.out.println("Before : " + arr);
		arr = sortByInsert.doAscending(arr);
		System.out.println("After  : " + arr);
		
	}

}

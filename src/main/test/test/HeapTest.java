package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStruct.Heap;

class HeapTest {

	@Test
	void testHeap() {
		Heap h = new Heap(Heap.MAX_TYPE);
		for(int i=9;i>0;i--){
			if(i==8) continue;
			h.insertMaxHeap(i);
		}
		
		int depth = h.getDepth();
		h.printHeap(depth);
		
		System.out.println(h.v);
		System.out.println(h.lastIndex);
		System.out.println(depth);
		
	}


}

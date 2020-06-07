package dataStruct;

import java.util.Collections;
import java.util.Vector;

public class Heap {
	public Vector<Integer> v;
	public int lastIndex;
	public final boolean MAX_HEAP;
	public final boolean MIN_HEAP;
	public static final int MAX_TYPE = 1;
	public static final int MIN_TYPE = 2;
	
	public Heap(int type) {
		super();
		if(type == MAX_TYPE) {
			MAX_HEAP = true;
			MIN_HEAP = false;
		} else {
			MAX_HEAP = false;
			MIN_HEAP = true;
		}
		
		this.v = new Vector<>(10);
		v.add(0);
		this.lastIndex = 0;
	}
	public void insertMaxHeap(int n) {
		//HEAP TYPE CHECK.
		if(!MAX_HEAP) {
			System.out.println("MAX HEAP이 아닙니다.");
			return;
		}
		
		lastIndex++;
		
		if(lastIndex == 1) {
			this.v.add(n);
			return;
		}
		//마지막 인덱스에 데이터 삽입
		this.v.add(n);
		
		//힙의 성질 무결성화
		int childIndex = lastIndex;
		while(true) {
			int parentIndex = childIndex / 2;
			
			if(parentIndex < 1) break;
			
			if(v.get(parentIndex) < v.get(childIndex)) {
				Collections.swap(v, parentIndex, childIndex);
				childIndex = parentIndex;
			} else break;
			
		}
	}
	public int getValue(int index) {
		return v.get(index);
	}
	public void deleteMaxHeap() {
		if(lastIndex == 0) {
			System.out.println("HEAP이 비어있습니다.");
			return;
		}
		//root element 삭제
		v.set(1, v.get(lastIndex));
		
		v.remove(lastIndex);
		lastIndex--;
		//힙의 성질 무결성화
		int parentIndex = 1;
		while(true) {
			if(parentIndex * 2 == lastIndex) {
				if(v.get(parentIndex) > v.get(parentIndex *2))
					Collections.swap(v, parentIndex, parentIndex * 2);
				return;
			}
			else if(parentIndex *2 > lastIndex) {
				return;
			}
			else {
				int leftChildIndex = parentIndex * 2;
				int rightChildIndex = (parentIndex * 2) + 1;
				
				if(v.get(leftChildIndex)<v.get(parentIndex) && v.get(rightChildIndex) < v.get(parentIndex))
					return;
				
				int targetIndex = (v.get(leftChildIndex) > v.get(rightChildIndex)) ? leftChildIndex : rightChildIndex;
				Collections.swap(v, parentIndex, targetIndex);
				parentIndex = targetIndex;
			}
		}
	}
	public int getDepth() {
		int depth = 1;
		int currentIndex = lastIndex; 
		while(currentIndex > 1) {
			currentIndex = currentIndex / 2;
			depth++;
			if(currentIndex == 1) {
				break;
			}
			
		}
		return depth;
	}
	public void printHeap(int depth) {
		if(lastIndex == 0) {
			return;
		}
		int index = 1;
		
		for(int step=0;step<depth;step++) {
			int nodeCount = (int)Math.pow(2.0,step);
			for(int i=0;i<nodeCount;i++) {
				if(index > lastIndex) 
					break;
				
				int space = (int) Math.pow(2.0, depth - step) ;
	
				for(int sp=0;sp<space;sp++)
					System.out.print(" ");
					
				if(i != 0) {
					for(int sp=0;sp<space-2;sp++)
						System.out.print(" ");
				}
			
				System.out.printf("%2d",v.get(index));
				index++;
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
}

package ad1;

import java.util.*;

class MinHeapPriorityQueue {

	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
		@Override 
		public int compare(Integer a, Integer b) {
			return b - a; 
		}
	}); 
	
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); 
	{
	int[] a = { 7,8,14,10,9,16,2,3,1,4 };
	
	int[] ia = null;
	for (int item : ia) {
		minHeap.add(item);
		maxHeap.add(item);
	}
	
	System.out.println("Min heap:");
	
	while (minHeap.size() != 0) {
		System.out.println(minHeap.poll());
	}
	
	System.out.println("Max heap:"); 
	while(maxHeap.size() != 0) {
		System.out.println(maxHeap.poll());
	} 
}
}
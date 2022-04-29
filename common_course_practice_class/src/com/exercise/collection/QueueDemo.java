package com.exercise.collection;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Person1");
		queue.add("Person2");
		queue.add("Person3");
		queue.add("Person4");
		queue.add("Person5");
		
		System.out.println("Elements in the queue are: " + queue);
		
		System.out.println("Head of the element in queue are: " + queue.element());
		//returns null if queue is empty
		System.out.println("Head of the element in queue are: " + queue.peek());
		
		//inserting an element into queue
		queue.offer("Person6");
		System.out.println("Element in the queue are:" +queue );
		
		// returns null if queue is empty
		queue.poll();
		System.out.println("Element after removing from queue are: " + queue);
		
		queue.remove();
		System.out.println("Element after removing an element from queue are: " + queue);
		
		//Iterating through elements from queue
		Iterator it = queue.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

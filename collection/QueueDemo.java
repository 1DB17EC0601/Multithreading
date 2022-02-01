package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	
	public static void main(String[] args) {
		
		Queue<Integer> s = new LinkedList<Integer>();
		
		s.add(23);
		s.add(21);
		s.add(24);
		s.add(26);
		s.add(27);
		
		System.out.println("the queue is "+s);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(21));
		System.out.println(s.contains(23));
		
		
		
		
		
	}
}

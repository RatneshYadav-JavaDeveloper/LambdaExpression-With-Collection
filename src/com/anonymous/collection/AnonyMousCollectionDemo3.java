package com.anonymous.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This is a new way to implement Comparator Interface using
 * Lambda Expression.
 * 
 * **/
public class AnonyMousCollectionDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(5);
		list.add(0);
		System.out.println(list);
		
		/**
		 * Here, I implement Comparator interface using Lambda expression directly.
		 * 
		 * */
		Comparator<Integer> c = (o1,o2)->(o1<o2)?-1:(o1>o2)?-1:0;
		Collections.sort(list, c);
		System.out.println(list);
	}
}

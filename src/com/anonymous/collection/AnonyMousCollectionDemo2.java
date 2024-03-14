package com.anonymous.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Here, implemented old way to Comparator Interface  
 * please check the AnonyMousCollectionDemo3.java for Calling
 * direct Comparator Interface using Lambda Expression to make
 * more concise code.
 * 
 * **/
class myComparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		/**
		 * Here using ternary operator, instead if else
		 * to make more concise code.
		 * **/
		return (o1 < o2) ? -1 : (o1 > o2) ? +1 : 0;

	}

}

public class AnonyMousCollectionDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(5);
		list.add(0);
		System.out.println(list);
		Collections.sort(list, new myComparator1());
		System.out.println(list);
	}
}

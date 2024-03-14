package com.anonymous.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Here, implemented old way to Comparator Interface  
 * please check the AnonyMousCollectionDemo2.java 
 * more concise code
 * 
 * **/
class myComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < 02) {
			return -1;
		} else if (o1 > 02) {
			return +1;
		} else {

			return 0;
		}
	}

}

public class AnonyMousCollectionDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(5);
		list.add(0);
		System.out.println(list);
		Collections.sort(list, new myComparator());
		System.out.println(list);
	}
}

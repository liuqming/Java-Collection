package org.lxh.collectiondemo.listdemo;

import java.util.LinkedList;

public class LinkedListDemo01 {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>() ;
		link.add("A") ;
		link.add("B") ;
		link.add("C") ;
		link.addFirst("X") ;
		link.addLast("Y") ;
		System.out.println("����ͷ��" + link.getFirst());
		System.out.println("����β��" + link.getLast());
	}

}

package org.lxh.collectiondemo.listdemo;

import java.util.LinkedList;

public class LinkedListDemo02 {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		link.addFirst("X");
		link.addLast("Y");
		for (int i = 0; i <= link.size(); i++) {
			System.out.print(link.element());	// ȡ����ͷ
		}
		System.out.println("\nelemtn()����֮��"+link);
		for (int i = 0; i <= link.size(); i++) {
			System.out.print(link.poll());	// ȡ����ͷ��ͬʱɾ����ͷ
		}
		System.out.print("\npoll()����֮��"+link);
	}

}

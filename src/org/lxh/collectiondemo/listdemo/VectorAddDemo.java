package org.lxh.collectiondemo.listdemo;

import java.util.List;
import java.util.Vector;

public class VectorAddDemo {
	public static void main(String args[]) {
		List<String> allList = new Vector<String>();// ΪList�ӿ�ʵ����
		allList.add("hello");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add(0, "MLDN");// ����Ԫ�أ�List�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		System.out.println(allList) ;
	}
}

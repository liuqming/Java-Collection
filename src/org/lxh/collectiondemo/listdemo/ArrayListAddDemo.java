package org.lxh.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
	public static void main(String args[]) {
		List<String> allList = new ArrayList<String>();// ΪList�ӿ�ʵ����
		allList.add("hello");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add(0, "MLDN");// ����Ԫ�أ�List�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		System.out.println(allList) ;
	}
}

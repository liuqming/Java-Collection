package org.lxh.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrintDemo01 {
	public static void main(String args[]) {
		List<String> allList = new ArrayList<String>();// ΪList�ӿ�ʵ����
		allList.add("hello");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add(0, "MLDN");// ����Ԫ�أ�List�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		for (int i = 0; i < allList.size(); i++) {// ѭ�����
			System.out.println(allList.get(i)); // �������
		}
	}
}

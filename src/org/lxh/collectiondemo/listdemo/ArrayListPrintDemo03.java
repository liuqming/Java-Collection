package org.lxh.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListPrintDemo03 {
	public static void main(String args[]) {
		Collection<String> allList = new ArrayList<String>();// ΪCollection�ӿ�ʵ����
		allList.add("hello");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add("MLDN");// ����Ԫ�أ�Collection�ӿڶ���
		allList.add("world");// ����Ԫ�أ�Collection�ӿڶ���
		String obj[] = allList.toArray(new String[]{}) ;
		for (int i = 0; i < obj.length; i++) {// ѭ�����
			String str = obj[i] ;
			System.out.println(str) ;
		}
	}
}

package org.lxh.collectiondemo.setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAddDemo {

	public static void main(String[] args) {
		Set<String> allSet = new TreeSet<String>();
		allSet.add("C"); // �����ظ�Ԫ��
		allSet.add("D"); // ���� 
		allSet.add("E"); // ����
		allSet.add("A"); // ����
		allSet.add("B"); // ����
		allSet.add("C"); // ����
		allSet.add("C"); // �����ظ�Ԫ��
		System.out.println(allSet);
	}

}

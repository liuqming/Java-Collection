package org.lxh.collectiondemo.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddDemo {

	public static void main(String[] args) {
		Set<String> allSet = new HashSet<String>();
		allSet.add("A"); // ����
		allSet.add("B"); // ����
		allSet.add("C"); // ����
		allSet.add("C"); // �����ظ�Ԫ��
		allSet.add("C"); // �����ظ�Ԫ��
		allSet.add("D"); // ����
		allSet.add("E"); // ����
		System.out.println(allSet);
	}

}

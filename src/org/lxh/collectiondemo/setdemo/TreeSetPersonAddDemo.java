package org.lxh.collectiondemo.setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPersonAddDemo {

	public static void main(String[] args) {
		Set<Person> allSet = new TreeSet<Person>();
		allSet.add(new Person("����",30)); // �����ظ�Ԫ��
		allSet.add(new Person("����",30)); // �����ظ�Ԫ��
		allSet.add(new Person("����",31)); // �����ظ�Ԫ��
		allSet.add(new Person("����",32)); // �����ظ�Ԫ��
		allSet.add(new Person("����",32)); // �����ظ�Ԫ��
		allSet.add(new Person("����",32)); // �����ظ�Ԫ��
		System.out.println(allSet);
	}

}

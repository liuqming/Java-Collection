package org.lxh.listiteartordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo01 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		allList.add("A");
		allList.add("B");
		allList.add("C");
		allList.add("D");
		allList.add("E");
		ListIterator<String> iter = allList.listIterator();
		System.out.print("��ǰ��������");
		while (iter.hasNext()) {
			System.out.print(iter.next() + "��");
		}
		System.out.print("\n�Ӻ���ǰ�����");
		while (iter.hasPrevious()) {
			System.out.print(iter.previous() + "��");
		}
	}

}

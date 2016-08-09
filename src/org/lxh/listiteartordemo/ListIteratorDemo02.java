package org.lxh.listiteartordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo02 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		allList.add("A");
		allList.add("B");
		allList.add("C");
		allList.add("D");
		allList.add("E");
		ListIterator<String> iter = allList.listIterator();
		iter.add("X"); // ��������
		System.out.print("��ǰ��������");
		while (iter.hasNext()) {
			String str = iter.next();
			iter.set(str + " - MLDN"); // �޸�
			System.out.print(str + "��");
		}
		System.out.print("\n�Ӻ���ǰ�����");
		while (iter.hasPrevious()) {
			System.out.print(iter.previous() + "��");
		}
	}

}

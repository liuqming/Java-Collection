package org.lxh.iteartordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		allList.add("A");
		allList.add("B");
		allList.add("C");
		allList.add("D");
		allList.add("E");
		Iterator<String> iter = allList.iterator();
		while (iter.hasNext()) {
			String str = iter.next(); // ȡ������
			if ("C".equals(str)) {
				iter.remove();// ɾ��Ԫ��
			}
			System.out.print(str + "��");
		}
		System.out.println("ɾ��֮��ļ��ϣ�" + allList);
	}
}

package org.lxh.foreachdemo;

import java.util.ArrayList;
import java.util.List;

public class ForeactDemo {
	public static void main(String[] args) {
		List<String> allList = new ArrayList<String>();
		allList.add("A");
		allList.add("B");
		allList.add("C");
		allList.add("D");
		allList.add("E");
		for (String str : allList) {
			System.out.print(str + "��");
		}
	}

}

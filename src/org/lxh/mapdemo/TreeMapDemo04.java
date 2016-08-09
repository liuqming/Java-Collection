package org.lxh.mapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("A��zhangsan", 1);
		map.put("A��zhangsan", 2);
		map.put("C��lisi", 3);
		map.put("B��wangwu", 5);
		Set<String> set = map.keySet(); // ����ȫ����key
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " --> " + map.get(key));
		}
	}

}

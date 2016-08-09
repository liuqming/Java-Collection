package org.lxh.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhangsan", 1);
		map.put("zhangsan", 2);
		map.put("lisi", 3);
		map.put("wangwu", 5);
		Set<String> set = map.keySet(); // ����ȫ����key
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " --> " + map.get(key));
		}
	}

}

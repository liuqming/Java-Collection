package org.lxh.propertiesdemo;

import java.util.Properties;

public class PropertiesDemo01 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("BJ", "BeiJing");
		pro.setProperty("NJ", "NanJing");
		pro.setProperty("TJ", "TianJin");
		System.out.println("���Դ��ڣ�" + pro.getProperty("BJ"));
		System.out.println("���Բ����ڣ�" + pro.getProperty("SC"));
		System.out.println("���Բ����ڣ�ָ��Ĭ��ֵ��" + pro.getProperty("SC", "û�д����ԣ�"));
	}
}

package org.lxh.collectiondemo.setdemo;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() { // ��дtoString()
		return "������" + this.name + "�����䣺" + this.age;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person) obj;
		if (this.name.equals(p.name) && this.age == p.age) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() { // ��������ķ���ֵ����ͨ��һ����ʽ�����
		// ��ʱ�Ĺ�ʽ�����ֵ�hashCode * age
		return this.name.hashCode() * this.age;
	}

	public int compareTo(Person o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return this.name.compareTo(o.name); // �Ƚ�name
		}
	}
}

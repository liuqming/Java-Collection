package org.lxh.execdemo02;

public class Student {
	private String name;
	private int age;
	private School school;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String toString(){
		return "ѧ��������"  +this.name + "��ѧ�����䣺" +this.age ;
	}
}

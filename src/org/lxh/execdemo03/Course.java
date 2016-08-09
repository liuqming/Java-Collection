package org.lxh.execdemo03;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private int credit;
	private List<Student> allStudents;

	public Course() {
		this.allStudents = new ArrayList<Student>();
	}

	public Course(String name, int credit) {
		this();
		this.name = name;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public List<Student> getAllStudents() {
		return allStudents;
	}
	public String toString(){
		return "�γ����ƣ�" + this.name + "���γ�ѧ�֣�" + this.credit ;
	}
}
 
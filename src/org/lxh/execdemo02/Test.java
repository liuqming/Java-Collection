package org.lxh.execdemo02;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		School school = new School("MLDN");
		Student stu1 = new Student("����", 23);
		Student stu2 = new Student("����", 25);
		Student stu3 = new Student("����", 22);
		school.getAllStudents().add(stu1); // һ��ѧУ�ж��ѧ��
		stu1.setSchool(school); // һ��ѧ������һ��ѧУ
		school.getAllStudents().add(stu2); // һ��ѧУ�ж��ѧ��
		stu2.setSchool(school); // һ��ѧ������һ��ѧУ
		school.getAllStudents().add(stu3); // һ��ѧУ�ж��ѧ��
		stu3.setSchool(school); // һ��ѧ������һ��ѧУ
		System.out.println(school);
		Iterator<Student> iter = school.getAllStudents().iterator();
		while (iter.hasNext()) {
			System.out.println("\t|- " + iter.next()); 
		}
	}

}

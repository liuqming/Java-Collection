package org.lxh.execdemo03;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Oracle", 3);
		Student stu1 = new Student("����", 20);
		Student stu2 = new Student("����", 21);
		Student stu3 = new Student("����", 22);
		Student stu4 = new Student("����", 23);
		Student stu5 = new Student("����", 24);
		Student stu6 = new Student("Ǯ��", 25);
		// ���������õ�һ�ſγ̵Ĺ�ϵ
		c1.getAllStudents().add(stu1);
		c1.getAllStudents().add(stu3);
		c1.getAllStudents().add(stu5);
		stu1.getAllCourses().add(c1);
		stu3.getAllCourses().add(c1);
		stu5.getAllCourses().add(c1);
		// ���������õ�һ�ſγ̵Ĺ�ϵ
		c2.getAllStudents().add(stu1);
		c2.getAllStudents().add(stu2);
		c2.getAllStudents().add(stu3);
		c2.getAllStudents().add(stu4);
		c2.getAllStudents().add(stu5);
		c2.getAllStudents().add(stu6);
		stu1.getAllCourses().add(c2);
		stu2.getAllCourses().add(c2);
		stu3.getAllCourses().add(c2);
		stu4.getAllCourses().add(c2);
		stu5.getAllCourses().add(c2);
		stu6.getAllCourses().add(c2);
		// ���һ�ſγ̺Ͳμӵ�ѧ��
		System.out.println(c1);
		Iterator<Student> iter1 = c1.getAllStudents().iterator();
		while (iter1.hasNext()) {
			System.out.println("\t|- " + iter1.next());
		}
		// ���һ��ѧ����������Ŀγ�
		System.out.println(stu1) ;
		Iterator<Course> iter2 = stu1.getAllCourses().iterator() ;
		while (iter2.hasNext()) {
			System.out.println("\t|- " + iter2.next());
		}
	}
}

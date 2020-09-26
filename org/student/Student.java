package org.student;

import org.college.College;
import org.department.Department;

public class Student {

	public void studentName() {
		System.out.println("Name");

	}
	public void studentDept() {
		System.out.println("IT Department");

	}
	public void studentID() {
		System.out.println("ID 001");

	}
	public static void main(String[] args) {
		Student stud=new Student();
           stud.studentDept();
           stud.studentID();
           stud.studentName();
        College clg=new College();
          clg.collegeCode();
          clg.collegeName();
          clg.collegeRank();
        Department dept=new Department();
        dept.deptName();
	}

}

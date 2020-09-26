package org.student;

import org.department.Department;

public class Student extends Department {

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
           stud.deptName();
           stud.collegeCode();
           stud.collegeName();
           stud.collegeRank();
  
      
	}

}

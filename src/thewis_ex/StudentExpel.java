package thewis_ex;

import java.util.ArrayList;

/**
 * 
 * �����л� Ŭ����
 *
 */
public class StudentExpel {

	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		// TODO Auto-generated constructor stub
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStudent(String stName, int iAge, int iStNum, String stMajor, String stSex) {
		expelStudents.add(new Student(stName, iAge, iStNum, stMajor, stSex));
	}

}

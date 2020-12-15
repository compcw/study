package thewis_ex;
/*
 * 학생정보 클래스
 * */
public class Student {
	private String stName;
	private int iAge;
	private int iStNum;
	private String stMajor;
	private String stSex;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String stName, int iAge, int iStNum, String stMajor, String stSex) {
		this.stName = stName;
		this.iAge = iAge;
		this.iStNum = iStNum;
		this.stMajor = stMajor;
		this.stSex = stSex;
	}

}

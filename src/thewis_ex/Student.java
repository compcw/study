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
	
	public void updateData(int i, String info) {
		switch(i) {
		case 1: //stName
			setStName(info);
			break;
		case 2: //iAge
			setiAge(Integer.parseInt(info));
			break;
		case 3: //iStNum
			setiStNum(Integer.parseInt(info));
			break;
		case 4: //stMajor
			setStMajor(info);
			break;
		case 5: //stSex
			setStSex(info);
			break;
		}
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getiAge() {
		return iAge;
	}

	public void setiAge(int iAge) {
		this.iAge = iAge;
	}

	public int getiStNum() {
		return iStNum;
	}

	public void setiStNum(int iStNum) {
		this.iStNum = iStNum;
	}

	public String getStMajor() {
		return stMajor;
	}

	public void setStMajor(String stMajor) {
		this.stMajor = stMajor;
	}

	public String getStSex() {
		return stSex;
	}

	public void setStSex(String stSex) {
		this.stSex = stSex;
	}
	
	

}

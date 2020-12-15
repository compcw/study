package thewis_ex;

public class ManClass {
	
	private int iAge;
	private int iHeight;
	private int iWeight;
	private String stName;

	public ManClass() {
		// TODO Auto-generated constructor stub		
	}
	public ManClass(int iAge, int iHeight, int iWeight, String stName) {
		this.iAge = iAge;
		this.iHeight = iHeight;
		this.iWeight = iWeight;
		this.stName = stName;
	}	
	public double calculatorBMI() {
		double result = iWeight / (iHeight*iHeight);
		return result;
	}
	public int getAge() {
//		return iAge;
		return this.iAge;
	}
	
	public void setAge(int iAge) {
		this.iAge = iAge;
	}

}

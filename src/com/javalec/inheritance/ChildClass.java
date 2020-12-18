package com.javalec.inheritance;

public class ChildClass extends ParentClass {
	public String stChild = "자식 클래스";
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void getMamaName() {
//		super.getMamaName();
		System.out.println("성 빼고 춘향");
	}
	
	
}

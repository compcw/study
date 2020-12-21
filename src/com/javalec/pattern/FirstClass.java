package com.javalec.pattern;

public class FirstClass {

	public FirstClass() {
		// TODO Auto-generated constructor stub
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());
	}

}

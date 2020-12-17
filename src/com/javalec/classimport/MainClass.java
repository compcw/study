package com.javalec.classimport;

import com.javalec.cal.*;

public class MainClass {
	public static void main(String[] args) {
		PlusClass plusClass = new PlusClass();
		int result = plusClass.plus(3, 7);
		
		System.out.println(result);
	}
}

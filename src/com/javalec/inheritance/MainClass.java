package com.javalec.inheritance;

public class MainClass {

	public static void main(String[] args) {
		ParentClass child = new ChildClass();
		System.out.print("아버지 성함 : ");
		child.getPapaName();
		System.out.print("어머니 성함 : ");
		child.getMamaName();		
		
		CompanyMenu storeone = new Storeone();
		CompanyMenu storetwo = new Storetwo();
		
		storeone.Kimchi();
		storeone.Mix();
		storeone.Sundae();
		storeone.rice();
		
		storetwo.Kimchi();
		storetwo.Mix();
		storetwo.Sundae();
		storetwo.rice();
	}
}

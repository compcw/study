package com.javalec.inheritance;

public class MainClass {

	public static void main(String[] args) {
		ParentClass child = new ChildClass();
		System.out.print("�ƹ��� ���� : ");
		child.getPapaName();
		System.out.print("��Ӵ� ���� : ");
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

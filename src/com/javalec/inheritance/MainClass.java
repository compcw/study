package com.javalec.inheritance;

public class MainClass {

	public static void main(String[] args) {
//		ParentClass child = new ChildClass();
//		System.out.print("�ƹ��� ���� : ");
//		child.getPapaName();
//		System.out.print("��Ӵ� ���� : ");
//		child.getMamaName();		
//		
//		CompanyMenu storeone = new Storeone();
//		CompanyMenu storetwo = new Storetwo();
//		
//		storeone.Kimchi();
//		storeone.Mix();
//		storeone.Sundae();
//		storeone.rice();
//		storeone.storeName();
//		
//		storetwo.Kimchi();
//		storetwo.Mix();
//		storetwo.Sundae();
//		storetwo.rice();
//		storetwo.storeName();
		
		// ���̵� �Ĵ� ���
		LunchMenu child1 = new Child1(100, 200, 300, 400, 500);
		LunchMenu child2 = new Child2(100, 200, 300, 400, 500);
		
		System.out.println(child1.calLunch());
		System.out.println(child2.calLunch());
		
	}
}

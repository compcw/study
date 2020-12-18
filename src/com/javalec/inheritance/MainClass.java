package com.javalec.inheritance;

public class MainClass {

	public static void main(String[] args) {
//		ParentClass child = new ChildClass();
//		System.out.print("아버지 성함 : ");
//		child.getPapaName();
//		System.out.print("어머니 성함 : ");
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
		
		// 아이들 식대 계산
		LunchMenu child1 = new Child1(100, 200, 300, 400, 500);
		LunchMenu child2 = new Child2(100, 200, 300, 400, 500);
		
		System.out.println(child1.calLunch());
		System.out.println(child2.calLunch());
		
	}
}

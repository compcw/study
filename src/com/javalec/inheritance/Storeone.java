package com.javalec.inheritance;

public class Storeone extends CompanyMenu {

	public Storeone() {
		// TODO Auto-generated constructor stub
	}

	public Storeone(int iPriceKimchi, int iPriceMix, int iPriceSundae, int iPriceRice) {
		super(iPriceKimchi, iPriceMix, iPriceSundae, iPriceRice);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void storeName() {
		// TODO Auto-generated method stub
		System.out.println("�����1");
	}
	
	@Override
	public void Kimchi() {
		// TODO Auto-generated method stub
		System.out.println("��ġ� : 4,500��");
	}
	
	@Override
	public void Sundae() {
		// TODO Auto-generated method stub
		System.out.println("���뱹 : �Ǹ����� ����");
	}

}

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
		System.out.println("스토어1");
	}
	
	@Override
	public void Kimchi() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500원");
	}
	
	@Override
	public void Sundae() {
		// TODO Auto-generated method stub
		System.out.println("순대국 : 판매하지 않음");
	}

}

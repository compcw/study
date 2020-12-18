package com.javalec.inheritance;

public class Storetwo extends CompanyMenu {

	public Storetwo() {
		// TODO Auto-generated constructor stub
	}

	public Storetwo(int iPriceKimchi, int iPriceMix, int iPriceSundae, int iPriceRice) {
		super(iPriceKimchi, iPriceMix, iPriceSundae, iPriceRice);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void Mix() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥 : 5,000원");
	}
	
	@Override
	public void Sundae() {
		// TODO Auto-generated method stub
		System.out.println("순대국 : 4,000원");
	}
	
	@Override
	public void rice() {
		// TODO Auto-generated method stub
		System.out.println("공기밥 : 무료");
	}

	@Override
	public void storeName() {
		// TODO Auto-generated method stub
		System.out.println("스토어2");
	}

}

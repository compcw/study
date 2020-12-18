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
		System.out.println("ºñºö¹ä : 5,000¿ø");
	}
	
	@Override
	public void Sundae() {
		// TODO Auto-generated method stub
		System.out.println("¼ø´ë±¹ : 4,000¿ø");
	}
	
	@Override
	public void rice() {
		// TODO Auto-generated method stub
		System.out.println("°ø±â¹ä : ¹«·á");
	}

}

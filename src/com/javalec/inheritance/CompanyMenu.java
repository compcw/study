package com.javalec.inheritance;

public abstract class CompanyMenu {
	String stClass = "본사 메뉴";
	
	private int iPriceKimchi;
	private int iPriceMix;
	private int iPriceSundae;
	private int iPriceRice;	
	
	// 생성자
	public CompanyMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyMenu(int iPriceKimchi, int iPriceMix, int iPriceSundae, int iPriceRice) {
		this.iPriceKimchi = iPriceKimchi;
		this.iPriceMix = iPriceMix;
		this.iPriceSundae = iPriceSundae;
		this.iPriceRice = iPriceRice;		
	}
	
	//매소드
	public abstract void storeName();
	
	public void Kimchi() {
		System.out.println("김치찌개 : 5,000원");
	}
	
	public void Mix() {
		System.out.println("비빔밥 : 6,000원");
	}
	
	public void Sundae() {
		System.out.println("순대국 : 5,000원");
	}
	
	public void rice() {
		System.out.println("공기밥 : 1,000원");
	}

	//getter, setter
	public int getiPriceKimchi() {
		return iPriceKimchi;
	}

	public void setiPriceKimchi(int iPriceKimchi) {
		this.iPriceKimchi = iPriceKimchi;
	}

	public int getiPriceMix() {
		return iPriceMix;
	}

	public void setiPriceMix(int iPriceMix) {
		this.iPriceMix = iPriceMix;
	}

	public int getiPriceSundae() {
		return iPriceSundae;
	}

	public void setiPriceSundae(int iPriceSundae) {
		this.iPriceSundae = iPriceSundae;
	}

	public int getiPriceRice() {
		return iPriceRice;
	}

	public void setiPriceRice(int iPriceRice) {
		this.iPriceRice = iPriceRice;
	}	
}

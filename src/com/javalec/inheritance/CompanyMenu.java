package com.javalec.inheritance;

public abstract class CompanyMenu {
	String stClass = "���� �޴�";
	
	private int iPriceKimchi;
	private int iPriceMix;
	private int iPriceSundae;
	private int iPriceRice;	
	
	// ������
	public CompanyMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyMenu(int iPriceKimchi, int iPriceMix, int iPriceSundae, int iPriceRice) {
		this.iPriceKimchi = iPriceKimchi;
		this.iPriceMix = iPriceMix;
		this.iPriceSundae = iPriceSundae;
		this.iPriceRice = iPriceRice;		
	}
	
	//�żҵ�
	public abstract void storeName();
	
	public void Kimchi() {
		System.out.println("��ġ� : 5,000��");
	}
	
	public void Mix() {
		System.out.println("����� : 6,000��");
	}
	
	public void Sundae() {
		System.out.println("���뱹 : 5,000��");
	}
	
	public void rice() {
		System.out.println("����� : 1,000��");
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

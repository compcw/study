package com.javalec.interfaceEx;

public class Toy implements IFireBoom, IMoveToy, IRocketBoom {

	@Override
	public void rocketBoom() {
		// TODO Auto-generated method stub
		System.out.println("���Ϲ߻�");
	}

	@Override
	public void moveToy() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ� ������");
	}

	@Override
	public void fireBoom() {
		// TODO Auto-generated method stub
		System.out.println("�Һ��߻�");
	}

}

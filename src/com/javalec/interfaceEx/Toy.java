package com.javalec.interfaceEx;

public class Toy implements IFireBoom, IMoveToy, IRocketBoom {

	@Override
	public void rocketBoom() {
		// TODO Auto-generated method stub
		System.out.println("로켓발사");
	}

	@Override
	public void moveToy() {
		// TODO Auto-generated method stub
		System.out.println("팔다리 움직임");
	}

	@Override
	public void fireBoom() {
		// TODO Auto-generated method stub
		System.out.println("불빛발사");
	}

}

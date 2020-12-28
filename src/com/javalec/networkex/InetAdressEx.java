package com.javalec.networkex;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx {
	
	Scanner scanner;
	
	public InetAdressEx() {
		System.out.println("Host �̸��� �Է��ϼ���. ");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer Name : " + inetAddress.getHostName());
			System.out.println("Computer Name : " + inetAddress.getHostAddress());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
}

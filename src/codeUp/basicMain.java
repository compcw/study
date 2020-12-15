package codeUp;

import java.util.*;
import java.io.*;

public class basicMain {
	//codeup 기초문제
	public static void testOutput() {
		// 코드업 출력 1001~
		// 1001 Hello
		System.out.println("Hello");
		// 1002 Hello World
		System.out.println("Hello World");
		/* 1003
		 * Hello
		 * World 
		 */
		System.out.println("Hello\nWorld");
		// 1004 'Hello'
		System.out.println("\'Hello\'");
		// 1005 "Hello World"
		System.out.println("\"Hello World\"");
		// 1006 "!@#$%^&*()"
		System.out.println("\"!@#$%^&*()\"");
		// 1007 "C:\Download\hello.cpp"
		System.out.println("\"C:\\Download\\hello.cpp\"");
		/*1008
		 * ┌┬┐
		 * ├┼┤
		 * └┴┘
		 */
		System.out.println("\u250C\u252C\u2510\n");
		System.out.println("\u251C\u253C\u2524\n");
		System.out.println("\u2514\u2534\u2518");
	}
	public static void testInOutput() {
		//1010 ~ 1018
		int a1010 = 0;
		Scanner scan1010 = new Scanner(System.in);
		a1010 = scan1010.nextInt();
		scan1010.close();
		System.out.printf("%d",a1010);
		//1011
		String x;
		Scanner scan1011 = new Scanner(System.in);
		x = scan1011.next();
		scan1011.close();
		System.out.println(x);
		//1012
		float x1012;
		Scanner scan1012 = new Scanner(System.in);
		x1012 = scan1012.nextFloat();
		scan1012.close();
		System.out.printf("%f",x1012);
		//1013
		int a1013, b1013;
		Scanner scan1013 = new Scanner(System.in);
		a1013 = scan1013.nextInt();
		b1013 = scan1013.nextInt();
		scan1013.close();
		System.out.printf("%d %d", a1013, b1013);
		//1014
		String a1014, b1014;
		Scanner scan1014 = new Scanner(System.in);
		a1014 = scan1014.next();
		b1014 = scan1014.next();
		scan1014.close();
		System.out.printf("%s %s", b1014, a1014);
		//1015
		float x1015;
		Scanner scan1015 = new Scanner(System.in);
		x1015 = scan1015.nextFloat();
		scan1015.close();
		System.out.printf("%.2f",x1015);
		//1017
		int a1017;
		Scanner scan1017 = new Scanner(System.in);
		a1017 = scan1017.nextInt();
		scan1017.close();
		System.out.printf("%d %d %d", a1017, a1017, a1017);		
		
	}
	public static void testInOutput2() {
		//1018
		String InTime = new String();
		int hour, minute;
		Scanner scan1018 = new Scanner(System.in);
		InTime = scan1018.next();
		scan1018.close();
		
		String[] time = InTime.split(":");
		hour = Integer.parseInt(time[0]);
		minute = Integer.parseInt(time[1]);
		
		System.out.printf("%d : %d", hour, minute);
		
		//1019		
		Scanner scan1019 = new Scanner(System.in);
		String InDate = scan1019.next();
		scan1019.close();
		
		String[] ReDate = InDate.split("\\.");
		int InYear = Integer.parseInt(ReDate[0]);
		int InMonth = Integer.parseInt(ReDate[1]);
		int InDay = Integer.parseInt(ReDate[2]);
		
		System.out.printf("%04d.%02d.%02d", InYear, InMonth, InDay);
		
		//1020
		scan1019.nextFloat();
	}	
	// 3의 배수 숫자 판단
	public static boolean threeMultiple(int a) {
		boolean result = false;
		
		//1번 검증
		if(a%3 == 0) {
			result = true;
		}
		
		//2번 검증
		result = (a%3 == 0) ? true : false;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기초출력문제 1001~1008
		//testOutput();
		// 기초 입출력 문제 1010~1017
		//testInOutput();
		// 기초 입출력 문제2 1018~1027
		//testInOutput2();
		// 3의 배수 판단 문제(threeMultiple(int))
		System.out.println(threeMultiple(3));
		
	}

}

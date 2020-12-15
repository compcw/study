package thewis_ex;

import java.util.*;

public class Main {
	// if문 예제
	// 점수 입력 후 평균, 각 점수 판단하기
	public static void ex4_1() {
		System.out.print("국어점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int iHan = sc.nextInt();		
		System.out.print("수학점수를 입력하세요 : ");		
		int iMath = sc.nextInt();		
		System.out.print("영어점수를 입력하세요 : ");		
		int iEng = sc.nextInt();
		sc.close();
		
		
		int iAvg = (iHan + iMath + iEng)/3;
		
		System.out.println("평균점수는 "+ iAvg + " 입니다.");
		
		String sHan = (iHan > iAvg) ? "높습니다" : "높지 않습니다";
		
		String sMath = "";
		if(iMath > iAvg) {
			sMath = "높습니다";
		} else {
			sMath = "높지 않습니다";
		}
		
		String sEng = "";
		if(iEng > iAvg) {
			sEng = "높습니다";
		} else if(iEng < iAvg){
			 sEng = "낮습니다";
		} else {
			sEng = "높지도 낮지도 않습니다";
		}

		System.out.println("국어 점수는 평균보다 "+sHan);
		System.out.println("수학 점수는 평균보다 "+sMath);
		System.out.println("영어 점수는 평균보다 "+sEng);		
		
	}
	/* for문 예제
	 * 1~10까지의 합 구하기
	 * 1~10까지의 숫자중 짝수 또는 홀수들의 합 구하기
	 * 구구단 만들기
	 * */	
	public static void ex4_2() {
		// 1~10 합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10의 합은 : "+sum);
		
		// 1~10 홀수, 짝수 각각의 합 구하기
		int oddSum = 0;
		int evenSum = 0;
		for(int j = 1; j <= 10; j++) {
			if(j%2 == 1) {
				//홀수
				oddSum += j;
			} else {
				evenSum += j;
			}
		}
		System.out.println("1~10 홀수의 합 : "+oddSum);
		System.out.println("1~10 짝수의 합 : "+evenSum);
		
		// 구구단만들기(A x B = AB)
		for(int a = 2; a < 10; a++) {
			System.out.println(a + "단 :");
			for(int b = 1; b < 10; b++) {
				System.out.println(a + " x " + b + " = " + (a*b));				
			}
		}
		
	}
	/* while 문 예제
	 * 1~100까지의 숫자 중 3의 배수의 합 구하기
	 * */
	public static void ex4_3() {
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			if(i%3 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("1~100 숫자중 3의 배수의 합은 : " + sum);
	}
	
	/*  배열예제
	 *   배열을 이용하여 영희, 철수, 길동, 영수, 말자의 키를 입력하고 평균치를 구해보자
	 *   가장 큰 학생과 가장 작은 학생을 구분해보자
	 * */
	public static void ex5_1() {
		String[] stName = {"영희", "철수", "길동", "영수", "말자"};
		int[] iHeight = new int[stName.length];
		int iSum = 0;
		int iMax = 0;
		int iMaxIndex = 0;
		int iMin = 0;
		int iMinIndex = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stName.length; i++) {
			System.out.print(stName[i]+"의 키를 입력하세요 : ");
			iHeight[i] = sc.nextInt();
			iSum += iHeight[i];
			
			if(iMax < iHeight[i]) {
				iMax = iHeight[i];
				iMaxIndex = i;
			}
			
			if(i == 0) {
				iMin = iHeight[i];
			}else if(iMin > iHeight[i]) {
				iMin = iHeight[i];
				iMinIndex = i;
			}
		}
		sc.close();
		
		System.out.println("학생들의 평균 신장은 : " + (iSum/5)+ "cm");
		System.out.println("가장 큰 학생 " + stName[iMaxIndex]+"의 키 : "+ iMax);
		System.out.println("가장 작은 학생 "+ stName[iMinIndex]+"의 키 : "+ iMin);		
		
	}

	/*  절차지향예제
	 *  메소드 활용
	 *  1. 1~10까지의 정수의 합 출력
	 *  2. 결과 값이 홀수면 '홀수입니다' 짝수면 '짝수입니다' 출력
	 *  ex6_1 / ex6_1_1(1번함수) / ex6_1_2(2번함수) 
	 * */
	public static void ex6_1() {
		System.out.println("1부터 10까지의 숫자의 합은 "+ex6_1_1()+"입니다");
		System.out.println(ex6_1_2());
	}
	public static String ex6_1_1() {
		String result = "";
		int iSum = 0;
		for(int i = 0;i <= 10; i++) {
			iSum += i;
		}
		result = Integer.toString(iSum);
		return result;
	}
	public static String ex6_1_2() {
		String result = "";
		int sum = Integer.valueOf(ex6_1_1());
		if(sum%2 == 0) {
			result = "짝수입니다";
		} else {
			result = "홀수입니다";
		}
		return result;
	}	
	
	/* 메소드 이해
	 * 사용자로부터 1~9 숫자중 1개를 입력받아 구구단을 출력해보자
	 * ex6_2 / ex6_2_1
	 * */
	public static void ex6_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단 단수를 입력 하세요 : ");
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(ex6_2_1(a, i));
		}
	}
	public static String ex6_2_1(int x, int y) {
		String result = "";		
		result = x + "x" + y + "=" + (x*y);		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex4_1();
//		ex4_2();
//		ex4_3();
//		ex5_1();
//		ex6_1();
//		ex6_2();
	}

}

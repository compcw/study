package thewis_ex;

import java.util.*;

public class Main {
	// if�� ����
	// ���� �Է� �� ���, �� ���� �Ǵ��ϱ�
	public static void ex4_1() {
		System.out.print("���������� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int iHan = sc.nextInt();		
		System.out.print("���������� �Է��ϼ��� : ");		
		int iMath = sc.nextInt();		
		System.out.print("���������� �Է��ϼ��� : ");		
		int iEng = sc.nextInt();
		sc.close();
		
		
		int iAvg = (iHan + iMath + iEng)/3;
		
		System.out.println("��������� "+ iAvg + " �Դϴ�.");
		
		String sHan = (iHan > iAvg) ? "�����ϴ�" : "���� �ʽ��ϴ�";
		
		String sMath = "";
		if(iMath > iAvg) {
			sMath = "�����ϴ�";
		} else {
			sMath = "���� �ʽ��ϴ�";
		}
		
		String sEng = "";
		if(iEng > iAvg) {
			sEng = "�����ϴ�";
		} else if(iEng < iAvg){
			 sEng = "�����ϴ�";
		} else {
			sEng = "������ ������ �ʽ��ϴ�";
		}

		System.out.println("���� ������ ��պ��� "+sHan);
		System.out.println("���� ������ ��պ��� "+sMath);
		System.out.println("���� ������ ��պ��� "+sEng);		
		
	}
	/* for�� ����
	 * 1~10������ �� ���ϱ�
	 * 1~10������ ������ ¦�� �Ǵ� Ȧ������ �� ���ϱ�
	 * ������ �����
	 * */	
	public static void ex4_2() {
		// 1~10 �� ���ϱ�
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10�� ���� : "+sum);
		
		// 1~10 Ȧ��, ¦�� ������ �� ���ϱ�
		int oddSum = 0;
		int evenSum = 0;
		for(int j = 1; j <= 10; j++) {
			if(j%2 == 1) {
				//Ȧ��
				oddSum += j;
			} else {
				evenSum += j;
			}
		}
		System.out.println("1~10 Ȧ���� �� : "+oddSum);
		System.out.println("1~10 ¦���� �� : "+evenSum);
		
		// �����ܸ����(A x B = AB)
		for(int a = 2; a < 10; a++) {
			System.out.println(a + "�� :");
			for(int b = 1; b < 10; b++) {
				System.out.println(a + " x " + b + " = " + (a*b));				
			}
		}
		
	}
	/* while �� ����
	 * 1~100������ ���� �� 3�� ����� �� ���ϱ�
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
		
		System.out.println("1~100 ������ 3�� ����� ���� : " + sum);
	}
	
	/*  �迭����
	 *   �迭�� �̿��Ͽ� ����, ö��, �浿, ����, ������ Ű�� �Է��ϰ� ���ġ�� ���غ���
	 *   ���� ū �л��� ���� ���� �л��� �����غ���
	 * */
	public static void ex5_1() {
		String[] stName = {"����", "ö��", "�浿", "����", "����"};
		int[] iHeight = new int[stName.length];
		int iSum = 0;
		int iMax = 0;
		int iMaxIndex = 0;
		int iMin = 0;
		int iMinIndex = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stName.length; i++) {
			System.out.print(stName[i]+"�� Ű�� �Է��ϼ��� : ");
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
		
		System.out.println("�л����� ��� ������ : " + (iSum/5)+ "cm");
		System.out.println("���� ū �л� " + stName[iMaxIndex]+"�� Ű : "+ iMax);
		System.out.println("���� ���� �л� "+ stName[iMinIndex]+"�� Ű : "+ iMin);		
		
	}

	/*  �������⿹��
	 *  �޼ҵ� Ȱ��
	 *  1. 1~10������ ������ �� ���
	 *  2. ��� ���� Ȧ���� 'Ȧ���Դϴ�' ¦���� '¦���Դϴ�' ���
	 *  ex6_1 / ex6_1_1(1���Լ�) / ex6_1_2(2���Լ�) 
	 * */
	public static void ex6_1() {
		System.out.println("1���� 10������ ������ ���� "+ex6_1_1()+"�Դϴ�");
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
			result = "¦���Դϴ�";
		} else {
			result = "Ȧ���Դϴ�";
		}
		return result;
	}	
	
	/* �޼ҵ� ����
	 * ����ڷκ��� 1~9 ������ 1���� �Է¹޾� �������� ����غ���
	 * ex6_2 / ex6_2_1
	 * */
	public static void ex6_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ �ܼ��� �Է� �ϼ��� : ");
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

package algorithm;

public class MultiplesOf3And5 {

	public MultiplesOf3And5() {
		super();
		// TODO Auto-generated constructor stub
	}
	//3�� 5�� ��� ���ؼ�  ���ϱ�(1000 �̸��� �ڿ���)
	public int solution() {
		int result = 0;
		
		for(int i = 1; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				result += i;
			}
		}		
		
		return result;
	}	

}

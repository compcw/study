package algorithm;

public class multiple {

	public multiple() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void solution(int X) {		
		int[] multiple = new int[9];		
		
		System.out.println(X+"단 출력 시작 : ");
		for(int i = 0;i<9;i++) {
			multiple[i] = (i+1)*X;
			System.out.println(X+"x"+(i+1)+"="+multiple[i]);
		}
	}	
}

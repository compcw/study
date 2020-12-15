package algorithm;

import java.util.*;

public class perMissingElem {

	public perMissingElem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int solution(int[] A) {

		Arrays.sort(A);
		
		for(int i = 0;i<A.length;i++) {
			if(i+1 != A[i]) {
				return i+1;
			}
		}		
		
		return A.length+1;
	}

}

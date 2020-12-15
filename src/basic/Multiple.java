package basic;

import java.util.*;

public class Multiple {
	int first;

	public Multiple(int first) {
		this.first = first;
	}
	
	public int[] all(){
		int[] result = new int[9];
		
		for(int i = 1; i <= 9; i++) {
			result[i-1] = this.first*i;
		}
		
		return result;
	}
	
	public String toString() {
		String result = "";
		
		
		return result;
	}
}

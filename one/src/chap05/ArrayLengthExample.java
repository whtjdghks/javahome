package chap05;

import java.text.DecimalFormat;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		int sum = 0;
			for(int i=0;i<scores.length; i++) {
				sum += scores[i];
			}
			System.out.println("총합 : " + sum);
			
			float avg = (float)sum / scores.length;
			System.out.println(" 평균 : "+avg);
	}
		// 실수 자릿수 구하는법알아야함
	
}

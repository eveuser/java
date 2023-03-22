package arrayExam;

import java.util.Scanner;

public class ArrayExam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = new int[5];
		int sum = 0;
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.println("성적입력 : ");
			sum = sc.nextInt();	
		}
		System.out.println("합계"+sum);
		avg= sum/5.0;
		System.out.printf("평균 : %.1f",avg);
	}

}

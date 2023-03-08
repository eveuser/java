package hellow;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		int sum;
		double avg;
		Scanner scp = new Scanner(System.in);

		
		System.out.println("첫번쨰 수 입력 : ");
		num1 = scp.nextInt();
		System.out.println("두번쨰 수 입력 : ");
		num2 = scp.nextInt();
		System.out.println("세번쨰 수 입력 : ");
		num3 = scp.nextInt();
		sum = num1+num2+num3;
		avg = sum/3.0;
		System.out.printf("합계 : %d 평균 : %.1f", sum,avg);

	}

}

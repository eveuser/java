package hellow;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		int sum;
		double avg;
		Scanner scp = new Scanner(System.in);

		
		System.out.println("ù���� �� �Է� : ");
		num1 = scp.nextInt();
		System.out.println("�ι��� �� �Է� : ");
		num2 = scp.nextInt();
		System.out.println("������ �� �Է� : ");
		num3 = scp.nextInt();
		sum = num1+num2+num3;
		avg = sum/3.0;
		System.out.printf("�հ� : %d ��� : %.1f", sum,avg);

	}

}

package hellow;

import java.util.Scanner;

public class ScanTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		
		int age = sc.nextInt();
		
		
		System.out.printf("내 나이는 %d세 입니다", age);

	}

}

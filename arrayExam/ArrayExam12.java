package arrayExam;

import java.util.Scanner;
public class ArrayExam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("숫자입력 : ");
			a[i] = sc.nextInt();	
		}
		
		for(int j=0; j<a.length; j++)
			System.out.println(a[j]);
	
	}

}

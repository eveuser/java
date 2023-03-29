package ifExam;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		switch(a%3) {
		case 0 : System.out.println(a+"는 3의배수");
		break;
		case 1 : 
		case 2 : System.out.println(a+"는 3의배수 아님");
		break;
		}
		

	}

}

package accuntExam;

public class AccuntMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accunt a1 = new Accunt("±èÅÂÈñ", 101);
		a1.setBalance(8000);
		Accunt a2 = new Accunt("¹è¼öÁö", 102, 0);
		
		a1.printInfo();
		a2.printInfo();
		
		a1.withdraw(5000);
		a2.withdraw(10000);
		a1.withdraw(1000);
		a2.withdraw(7000);
		
		a1.printInfo();
		a2.printInfo();
		
		a1.withdraw(5000);

	}

}

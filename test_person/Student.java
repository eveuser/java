package test_person;

public class Student extends Person{
	
	boolean online;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		if(online)
			System.out.println("���� �¶��� ���� ��");
		else
			System.out.println("���� � ���� ��");
	}
	

}

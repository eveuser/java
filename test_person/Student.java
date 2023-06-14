package test_person;

public class Student extends Person{
	
	boolean online;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		if(online)
			System.out.println("현재 온라인 수업 중");
		else
			System.out.println("현재 등교 수업 중");
	}
	

}

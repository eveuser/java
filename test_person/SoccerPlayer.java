package test_person;

public class SoccerPlayer extends Person{
	
	String teamName;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		System.out.println(name+"��"+teamName+"�� �౸����");
	}

}

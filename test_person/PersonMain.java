package test_person;

import test_book2.Cartoon;
import test_book2.Major;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.age = 23;
		s1.name = "������";
		s1.online = true;
		
		s1.printInfo();
		
		SoccerPlayer s2 = new SoccerPlayer();
		s2.age = 28;
		s2.name = "���ڰ�";
		s2.teamName = "����FC";
		
		s2.printInfo();

	}

}

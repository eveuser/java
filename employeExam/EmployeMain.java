package employeExam;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("�̵���");
		e1.setNo(100);
		e1.setAge(25);
		System.out.println("[��������]" + e1.toString());
		
		Employee e2 = new Employee("������", 200,18);
		System.out.println("[��������]" + e2.toString());
		
		e1.setNo(300);
		System.out.println(e1.getName() + "���� �����" + e1.getNo() + "���� �����");
		
		e2.setNo(20);
		System.out.println(e2.getName() + "���� �����" + e2.getNo() + "���� �����");
		
		System.out.println("[��������]" + e2.toString());

	}

}

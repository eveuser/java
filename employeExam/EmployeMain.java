package employeExam;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("이도령");
		e1.setNo(100);
		e1.setAge(25);
		System.out.println("[직원정보]" + e1.toString());
		
		Employee e2 = new Employee("성춘향", 200,18);
		System.out.println("[직원정보]" + e2.toString());
		
		e1.setNo(300);
		System.out.println(e1.getName() + "님의 사번이" + e1.getNo() + "으로 변경됨");
		
		e2.setNo(20);
		System.out.println(e2.getName() + "님의 사번이" + e2.getNo() + "으로 변경됨");
		
		System.out.println("[직원정보]" + e2.toString());

	}

}

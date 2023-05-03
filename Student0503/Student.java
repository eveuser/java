package Student0503;

public class Student {

	private String name;
	private int grade;
	
	void setName(String name) {
		this.name = name;  
		}
	String getName() {
		return name;  
		}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("학생의 이름은"+this.name+"이고,"+this.grade+"학년입니다");
	}
	
}

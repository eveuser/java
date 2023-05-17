package Student0517;

public class Student {

	//멤버변수
	private String name;
	private int grade;
	
	//생성자
	public Student(){
		
	}
	public Student(String name) {
		this.name = name;
	
	}
	public Student(String name , int grade) {
		this(name);
		this.grade = grade;
	}
	//생성자 오버로딩
	
	//메소드
	public void print() {
		System.out.println("학생의 이름은 "+name+"이고, "+grade+"학년입니다.");
	}
	
	void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	void setGrade(int grade){
		this.grade = grade;
	}
	
	public int getGrade(){
		return grade;
	}
	
}

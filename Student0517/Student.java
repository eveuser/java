package Student0517;

public class Student {

	//�������
	private String name;
	private int grade;
	
	//������
	public Student(){
		
	}
	public Student(String name) {
		this.name = name;
	
	}
	public Student(String name , int grade) {
		this(name);
		this.grade = grade;
	}
	//������ �����ε�
	
	//�޼ҵ�
	public void print() {
		System.out.println("�л��� �̸��� "+name+"�̰�, "+grade+"�г��Դϴ�.");
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

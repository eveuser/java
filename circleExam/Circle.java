package circleExam;

public class Circle {
	
	private double radius;
	private final static double PI = 3.14;
	//기본생성자
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius= radius;
	}
	
	public double computeArea() {
		return radius*radius*PI;
		
	}
	
	public double computePerimeter() {
		return radius*2*PI;
	}

}



package cafeExam;

public class Cafe {
	private int coffee;
	private int suger;
	private int cream;
	
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("��Ŀ�� ");
		System.out.println("Ŀ�ǳ� "+coffee);
	}
	
	public void makeTea(int coffee, int suger) {
		this.coffee = coffee;
		this.suger= suger;
		
		System.out.println("����Ŀ�� ");
		System.out.println("Ŀ�ǳ� "+(coffee+suger));
	}
	
	public void makeTea(int coffee, int suger, int cream) {
		this.coffee = coffee;
		this.suger= suger;
		this.cream= cream;
		
		System.out.println("����Ŀ�� ");
		System.out.println("Ŀ�ǳ� "+(coffee+suger+cream));
	}



}

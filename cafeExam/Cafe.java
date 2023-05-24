package cafeExam;

public class Cafe {
	private int coffee;
	private int suger;
	private int cream;
	
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("ºí·¢Ä¿ÇÇ ");
		System.out.println("Ä¿ÇÇ³óµµ "+coffee);
	}
	
	public void makeTea(int coffee, int suger) {
		this.coffee = coffee;
		this.suger= suger;
		
		System.out.println("¼³ÅÁÄ¿ÇÇ ");
		System.out.println("Ä¿ÇÇ³óµµ "+(coffee+suger));
	}
	
	public void makeTea(int coffee, int suger, int cream) {
		this.coffee = coffee;
		this.suger= suger;
		this.cream= cream;
		
		System.out.println("¼³ÅÁÄ¿ÇÇ ");
		System.out.println("Ä¿ÇÇ³óµµ "+(coffee+suger+cream));
	}



}

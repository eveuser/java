package accuntExam;

public class Accunt {
	private String name;
	private int no;
	private int balance;
	
	public Accunt() {}
	public Accunt(String name, int no) {
		this.name = name;
		this.no = no;
	}
	public Accunt(String name, int no,int balance) {
		this(name,no);
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =  name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int Balance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money){
		balance += money;
		System.out.println(name + "��" + money + "�� �Ա�");
	}
	public void withdraw(int money) {
		if(balance<money)
			System.out.println(name + "��" + money + "�� ��� ����-�����ܾ�" + balance + "��");
		else {
			balance -= money;
			System.out.println(name + "��" + money + "�� ���");
		}
	}
	
	public void printInfo() {
		System.out.println("[��������]������" + name + "���¹�ȣ:" + no + "�����ܰ�:" + balance);
	}
	
}

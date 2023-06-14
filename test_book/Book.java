package test_book;

public class Book {
	
	private int no;
	private String name;
	private int count;
	private int borrow;
	private final static String Libary="�κ�������";
	private static int bookCnt = 0;
	
	public Book() {
		bookCnt ++;
	}

	public Book(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}

	public Book(int no, String name, int count, int borrow) {
		this(no, name);
		this.count = count;
		this.borrow = borrow;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getBorrow() {
		return borrow;
	}

	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}

	public static int getBookCnt() {
		return bookCnt;
	}

	public static void setBookCnt(int bookCnt) {
		Book.bookCnt = bookCnt;
	}

	public static String getLibary() {
		return Libary;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printInFo() {
	System.out.println("��ȣ:"+no+"���ø�:"+name+"��������"+count+"��߰���:"+borrow);	
	}
	
	public void borrowBook(int cnt) {
		if(count<cnt) {
			System.out.println(no+"�� ����"+cnt+"�� ���� ����");
		}
		else{
			count -= cnt;
			borrow += cnt;
			System.out.println(no+"�� ����"+cnt+"�� ���� ����");
			
		}
			
	}
			
	public void returnBook(int cnt) {
		if(borrow<cnt) {
			System.out.println(no+"�� ����"+cnt+"�� ���� ����");
		}
		else {
			count += cnt;
			borrow += cnt;
			System.out.println(no+"�� ����"+cnt+"�� �ݳ� ����");
		}
	}
	
}

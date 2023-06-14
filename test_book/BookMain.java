package test_book;


public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Book.getLibary()+"의 현재 도서는"+Book.getBookCnt()+"권 입니다.");
		 System.out.println("********");
		 
		 Book b1 = new Book();
		 b1.setNo(101);
		 b1.setName("구름빵");
		 b1.setCount(10);
		 b1.setBorrow(0);
		 
		 Book b2 = new Book(102, "수박수영장");
		 b2.setCount(5);
		 b2.setBorrow(0);
		 
		 Book b3 = new Book(103, "강아지똥", 15, 0 );
		 b1.printInFo();
		 b2.printInFo();
		 b3.printInFo();
		 
		 System.out.println("*******");
		 
		 System.out.println(Book.getLibary()+"의 현재 도서는"+Book.getBookCnt()+"권 입니다.");
		 
		 System.out.println("*******");
		 
		 b1.borrowBook(15);
		 b2.returnBook(2);
		 b1.borrowBook(5);
		 b3.borrowBook(10);
		 b3.returnBook(5);
		 
		 System.out.println("*******");
		 
		 b1.printInFo();
		 b2.printInFo();
		 b3.printInFo();
		 

	}

}

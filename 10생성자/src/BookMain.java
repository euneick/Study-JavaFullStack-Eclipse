
/**
 * this, this() 활용 예제
 */
class Book {

	String title;
	String author;
	int madeYear;

	public Book() { this("제목 없음", "작자 미상", 0); }
	
	public Book(String title, String author) { this(title, author, 0); }

	public Book(String title, String author, int madeYear) {

		this.title = title;
		this.author = author;
		this.madeYear = madeYear;
	}
	
	public void printInfo() {
		
		System.out.println("책 제목 : " + title);
		System.out.println("책 저자 : " + author);
		System.out.println("출판 연도 : " + madeYear);
	}

}

public class BookMain {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.printInfo();
		
		System.out.println();
		
		Book book2 = new Book("책의 제목", "책의 저자");
		book2.printInfo();
		
		System.out.println();
		
		Book book3 = new Book("또다른 책의 제목", "또다른 책의 저자", 2024);
		book3.printInfo();
	}

}

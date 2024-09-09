
/**
 * 추상클래스, 추상메소드 활용 예제
 */
abstract class Board {
	
	protected String title;
	protected String content;
	protected String author;
	protected String date;
	
	public Board(String title, String content, String author, String date) {

		this.title = title;
		this.content = content;
		this.author = author;
		this.date = date;
	}
	
	public void printInfo() {
		
		System.out.println("<<게시글 정보>>");
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		System.out.println("작성자 : " + author);
		System.out.println("작성날짜 : " + date);
	}
	
	public abstract void addPost();
	public abstract void updatePost(String updateContent);
	public abstract void deletePost();
}

class GeneralBoard extends Board {

	public GeneralBoard(String title, String content, String author, String date) {
		super(title, content, author, date);
	}

	@Override
	public void addPost() {
		
		System.out.println("일반 게시판에 글을 추가했습니다.");
	}

	@Override
	public void updatePost(String content) {
		
		this.content = content;
		System.out.println("일반 게시판의 글을 수정했습니다.");
	}

	@Override
	public void deletePost() {
		
		System.out.println("일반 게시판의 글을 삭제했습니다.");
	}	
}

class NoticeBoard extends Board {

	public NoticeBoard(String title, String content, String author, String date) {
		super(title, content, author, date);
	}

	@Override
	public void addPost() {
		
		System.out.println("공지사항 게시판에 글을 추가했습니다.");
	}

	@Override
	public void updatePost(String content) {
		
		this.content = content;
		System.out.println("공지사항 게시판의 글을 수정했습니다.");
	}

	@Override
	public void deletePost() {
		
		System.out.println("공지사항 게시판의 글을 삭제했습니다.");
	}
}

public class Main {

	public static void main(String[] args) {
		
		GeneralBoard generalBoard = new GeneralBoard("일반 글", "이것은 일반 게시판의 글 내용입니다.", "홍길동", "2024-09-09");

		System.out.println("========일반 게시판========");
		generalBoard.printInfo();
		System.out.println();
		generalBoard.addPost();
		System.out.println();
		generalBoard.updatePost("이것은 일반 게시판의 수정된 글 내용입니다.");
		System.out.println();
		generalBoard.printInfo();
		System.out.println();
		generalBoard.deletePost();
		System.out.println();
		
		System.out.println();
		
		NoticeBoard noticeBoard = new NoticeBoard("공지사항", "이것은 공지사항 게시판의 글 내용입니다.", "김철수", "2024-09-09");

		System.out.println("========공지사항 게시판========");
		noticeBoard.printInfo();
		System.out.println();
		noticeBoard.addPost();
		System.out.println();
		noticeBoard.updatePost("이것은 공지사항 게시판의 수정된 글 내용입니다.");
		System.out.println();
		noticeBoard.printInfo();
		System.out.println();
		noticeBoard.deletePost();
		System.out.println();
	}

}

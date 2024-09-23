import java.io.File;

/**
 * File 클래스 예제
 */
public class FileTest02 {

	public static void main(String[] args) {

		File fileDir = new File(".");

		String[] fileList = fileDir.list();

		System.out.println("<<현재 경로의 파일 및 폴더 목록>>");
		for (int i = 0; i < fileList.length; i++)
			System.out.println(fileList[i]);

		File deleteFile = new File("C:\\ProjectPlace\\JavaFullStack\\a\\d.java");
		System.out.println(deleteFile.delete() ? "파일 삭제 완료" : "파일 삭제 실패");

		File createFile = new File("C:\\ProjectPlace\\JavaFullStack\\a\\b");
		System.out.println(createFile.mkdir() ? "경로 생성 완료" : "경로 생성 실패"); 		// 부모 디렉토리가 존재 해야 실행 가능

		File createFile2 = new File("C:\\ProjectPlace\\JavaFullStack\\a\\c\\d");
		System.out.println(createFile2.mkdirs() ? "경로 생성 완료" : "경로 생성 실패"); 	// 부모 디렉토리가 없으면 같이 생성

		System.out.println(fileDir.isFile() ? "파일입니다." : "파일이 아닙니다.");
		System.out.println(fileDir.isDirectory() ? "폴더입니다." : "폴더가 아닙니다.");
	}

}

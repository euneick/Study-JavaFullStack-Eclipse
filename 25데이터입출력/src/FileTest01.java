import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * File 클래스 예제
 */
public class FileTest01 {

	public static void main(String[] args) throws IOException {

		File file;

		byte[] byteFileName = new byte[100];
		String fileName;

		System.out.print("파일 이름 입력 : ");
		System.in.read(byteFileName);

		fileName = new String(byteFileName).trim();

		file = new File(fileName);

		System.out.println("<<" + fileName + " 파일 상세 정보>>");
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		System.out.println("생성 날짜 : " + (new Date(file.lastModified())));
		System.out.println("파일 크기 : " + file.length() + " Bytes");
		System.out.println("원본 이름 : " + file.getName());
		
		System.out.println("읽기 가능 : " + file.canRead());
		System.out.println("쓰기 가능 : " + file.canWrite());
		
		System.out.println("부모 디렉터리 이름 : " + file.getParent());
		System.out.println("숨김 여부 : " + file.isHidden());
	}

}

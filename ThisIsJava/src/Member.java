
/**
 * 롬복 라이브러리 예제
 * 
 * 명령 프롬포트를 통해 lombok.jar 파일이 있는 경로에서
 * java -jar lombok.jar
 * 명령어로 롬복을 설치 한 후
 * 프로젝트에 bulid path에 lombor.jar를 등록하여 사용
 */

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@Data		// getter, setter, hashCode(), equals(), toString() 메소드를 자동으로 생성하는 롬복 어노테이션
@NoArgsConstructor		// 매개변수가 없는 기본 생성자를 자동으로 생성하는 롬복 어노테이션
@AllArgsConstructor		// 모든 필드변수를 초기화하는 생성자를 자동으로 생성하는 롬복 어노테이션
public class Member {

	private String id;
	@NonNull private String name;		// 해당 필드만 초기화 시키는 생성자를 자동으로 생성하는 롬복 어노테이션
	private int age;
}


/**
 * 중첩 인터페이스 활용 예제
 */
package sec06.exam01;

class Button {

	// 정적 멤버 인터페이스
	public static interface ClickListener {
		
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener listener) {
		
		clickListener = listener;
	}
	
	public void click() {
		
		clickListener.onClick();
	}
}

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		// 로컬 클래스
		class OkListener implements Button.ClickListener {

			@Override
			public void onClick() {
			
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener());		
		btnOk.click();
		
		Button btnCancle = new Button();
		
		// 로컬 클래스
		class CancleListener implements Button.ClickListener {

			@Override
			public void onClick() {
			
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}
		
		btnCancle.setClickListener(new CancleListener());
		btnCancle.click();
	}

}

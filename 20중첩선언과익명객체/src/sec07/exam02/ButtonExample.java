
/**
 * 익명 구현 객체 활용 예제
 */
package sec07.exam02;

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

		btnOk.setClickListener(new Button.ClickListener() {

			@Override
			public void onClick() {

				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
		btnOk.click();

		Button btnCancle = new Button();

		btnCancle.setClickListener(new Button.ClickListener() {

			@Override
			public void onClick() {

				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		});
		btnCancle.click();
	}

}
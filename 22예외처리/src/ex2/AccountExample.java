package ex2;

/**
 * 사용자 정의 예외처리 및 강제로 예외 발생시키기 예제
 */

class InsufficientException extends Exception {
	
	public InsufficientException() {}
	
	public InsufficientException(String msg) { super(msg); }
}

class Account {
	
	private long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws InsufficientException {

		if (balance < money) throw new InsufficientException("잔고 부족 : " + (money - balance) + " 모자람");
		
		balance -= money;
	}
}

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(30000);
		}
		catch (InsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}

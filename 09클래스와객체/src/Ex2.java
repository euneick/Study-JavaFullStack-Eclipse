
class FruitSeller {

	final int APPLEPRICE = 1000;

	int numberOfApple;
	int currentRevenue;

	public int saleApple(int money) {

		int number = money / APPLEPRICE;

		numberOfApple -= number;
		currentRevenue += money;

		return number;
	}

	public void printCurrentInfo() {

		System.out.println("보유 사과 수 : " + numberOfApple);
		System.out.println("현재 잔고 : " + currentRevenue);
	}
}

class FruitBuyer {

	int currentMoney = 5000;
	int numberOfApple = 0;

	public void buyApple(FruitSeller fruitSeller, int money) {

		numberOfApple += fruitSeller.saleApple(money);
		currentMoney -= money;
	}

	public void printCurrentInfo() {

		System.out.println("보유 사과 수 : " + numberOfApple);
		System.out.println("현재 잔고 : " + currentMoney);
	}
}

public class Ex2 {
	public static void main(String[] args) {

		FruitSeller fruitSeller = new FruitSeller();
		FruitBuyer fruitBuyer = new FruitBuyer();

		fruitSeller.numberOfApple = 20;
		
		fruitBuyer.buyApple(fruitSeller, 2000);
		
		// 과일 판매자의 현재상황
		System.out.println("--과일 판매자의 현재상황--");
		fruitSeller.printCurrentInfo();

		// 과일 구매자의 현재상황
		System.out.println("--과일 구매자의 현재상황--");
		fruitBuyer.printCurrentInfo();
	}

}

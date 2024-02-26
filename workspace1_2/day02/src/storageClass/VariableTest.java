package storageClass;

public class VariableTest {
	int money = 10000;
	static int money_s = 10000;
	
	void increaseMoney() {
		money -= 1000;
		System.out.println(money);
	}
	static void increaseMoney_s() {
		money_s -= 1000;
		System.out.println(money_s);
	}
	
}

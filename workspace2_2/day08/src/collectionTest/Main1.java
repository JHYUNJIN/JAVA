package collectionTest;

public class Main1 {
	public static void main(String[] args) {
		// Coffee 테스트
		
		Cafe cafe = new Cafe();
		Coffee c1 = new Coffee("아메리카노",3500);
		Coffee c2 = new Coffee("아이스티",3000);
		
		cafe.add(c1);
		cafe.add(c2);
		
		
		
		System.out.println(Cafe.coffees);
		System.out.println();
		cafe.remove("아메리카노");
		System.out.println();
		System.out.println(Cafe.coffees);
	}
}

package set;

public class LottoMain {
	public static void main(String[] args) {
		Lotto.printLotto(5); //static 때문에 사용가능
		
		Lotto l = new Lotto();
		l.printLotto(5);
	}
}

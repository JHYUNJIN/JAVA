package lambda;

public class CalcMain{
	public static void main(String[] args) {
		action((x,y) -> {
			int result = x+y;
			System.out.println("result = "+result);
		});
		action((x,y) -> {
			int result = x-y;
			System.out.println("result = "+result);
		});
	}

	public static void action(Calcularot calc) {
		int x=10;
		int y=5;
		
		calc.calculator(x, y);
	}
}

package musicinter;

public class Rock implements Music {
	
	
	@Override
	public void mode() {
		System.out.println("락 모드가 실행되었습니다.");
		
	}

	public void onlyRock() {
		System.out.println("only Rock를 실행합니다.");
	}
}

package music;

public class Rock extends Music {
	
	
	@Override
	void mode() {
		System.out.println("락 모드가 실행되었습니다.");
		
	}

	void onlyRock() {
		System.out.println("only Rock를 실행합니다.");
	}
}

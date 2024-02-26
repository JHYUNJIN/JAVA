package day01;

public class Wizard extends Character {
	public Wizard() {
		super("소서리스", 15, 30, 500, 1, 30, 100);
	}

	@Override
	void normalAttack() {
		System.out.println(name+"이 기본공격을 실행하였습니다.");
		System.out.println("적에게"+normalDmg+"만큼 피해를 입혔습니다.");
		hp-=2;
		revive();
		showStatus();		
	}
	
}

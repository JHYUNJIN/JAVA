package day01;

public class Rogue extends Character {
	public Rogue() {
		super("네크로멘서",20,20,100,3,20,1);
	}
	


	@Override
	void skillAttack() {
		if(!checkMp(2)) {
			return;
		}
		else {
			System.out.println(name+"가 스킬공격!");
			System.out.println("적에게 "+skillDmg+"만큼의 피해를 입혔습니다.");
			System.out.println("hp-5");
			System.out.println("mp-2");
			hp-=5;
			mp-=2;
			revive();
			showStatus();
		}
	}

	@Override
	void specialAttack() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	System.out.println("적에게"+(specialDmg*(Math.random()*80)+20)+"만큼의 피해를 입혔습니다.");
	showStatus();

	}
	
}

	


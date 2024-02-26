package day01;

public class Warrior extends Character {
	public Warrior() {
		super("바바리안", 30, 10, 1000, 5, 10, 100);
	}

	@Override
	void normalAttack() {
		// TODO Auto-generated method stub
		mp-=3;
		super.normalAttack();
	}

	@Override
	void skillAttack() {
		if(!checkMp(3)) {
			return;
		}
		else {
			System.out.println(name+"가 스킬공격!");
			System.out.println("적에게 "+skillDmg+"만큼의 피해를 입혔습니다.");
			System.out.println("mp-3");
			mp-=3;
			showStatus();
		}
	}
	@Override
	void specialAttack() {
		for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("적에게"+specialDmg+"만큼의 피해를 입혔습니다.");
		hp-=10;
		revive();
		showStatus();
		
			}
		}

	
	


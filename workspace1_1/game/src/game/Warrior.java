package game;

public class Warrior extends Character{
	public Warrior() {
		super("전사",30,10,5,15,100);
	}

	@Override
	void skillAttack() {
		if(!checkMp(3)) {
			System.out.println("Mp부족");
			return;
		}
	System.out.println(name+"이(가) 스킬공격을 실행하였습니다.");
    System.out.println("적에게 "+skillDmg+"만큼 피해를 입혔습니다.");
    mp-=3;
    showStatus();
	}
    @Override
	void specialAttack() {
		System.out.println(name+"이(가) 필살기 시전 중..");
    

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("적에게 "+specialDmg+"만큼 피해를 입혔습니다.");
		hp-=10;
		
		revive();
		showStatus();
		}
    	
    void onlyWarrior() {
    	System.out.println("위대한 전사가 게임을 종료합니다.");
    }
    
    
    
	}
	


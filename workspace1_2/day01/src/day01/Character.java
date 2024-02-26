package day01;

public class Character {

	String name;
	int hp;
	int mp;
	int maxHp;
	int maxMp;
	int gold;
	
	int normalDmg;
	int skillDmg;
	int specialDmg;
	
	public Character(String name, int maxHp, int maxMp, int gold, int normalDmg, int skillDmg,
			int specialDmg) {
		this.name = name;
		this.hp = maxHp;
		this.mp = maxMp;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.gold = gold;
		this.normalDmg = normalDmg;
		this.skillDmg = skillDmg;
		this.specialDmg = specialDmg;
	}
	
	void showStatus() {
		System.out.println("==="+name+" 상태===");
		System.out.println("Hp : "+hp+"/"+maxHp);
		System.out.println("Mp : "+mp+"/"+maxMp);
	}
	
	void normalAttack() {
		System.out.println(name+"이 기본공격을 실행하였습니다.");
		System.out.println("적에게"+normalDmg+"만큼 피해를 입혔습니다.");
		showStatus();		
	}
	boolean checkMp(int needMp) {
		if(mp<needMp) {
			return false;
		}
		return true;
	}
	
	
	void skillAttack() {
		if(!checkMp(10)) {
			return;
		}
		else {
			System.out.println(name+"가 스킬공격!");
			System.out.println("적에게 "+skillDmg+"만큼의 피해를 입혔습니다.");
			System.out.println("mp-10");
			mp-=10;
			showStatus();
		}
		
		
	}
	void revive() {
		if(hp<=0) {
			System.out.println("사망");
			System.out.println("부활");
			hp=maxHp;
			mp=maxMp;
			gold=0;
		}
	}
	void specialAttack() {
		if(!checkMp(10)) {
			return;
		}
		else {
			for(int i=0;i<3;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
		System.out.println("적에게"+specialDmg+"만큼의 피해를 입혔습니다.");
		hp-=10;
		mp-=10;
		revive();
		showStatus();
		
			}
		}
	}
	
	

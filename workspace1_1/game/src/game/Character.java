package game;

public class Character {

		String name; // 캐릭터 이름
		int hp; //현재 체력
		int mp; //현재 마나
		int maxHP; //최대 체력
		int maxMP; // 최대 마나
		
		//기본공격력
		int normalDmg;
		//스킬공격력
		int skillDmg;
		//특수공격력
		int specialDmg;
		
		public Character(String name, int maxHP, int maxMP, int normalDmg, int skillDmg,
				int specialDmg) {
			super();
			this.name = name;
			this.hp = maxHP;
			this.mp = maxMP;
			this.maxHP = maxHP;
			this.maxMP = maxMP;
			this.normalDmg = normalDmg;
			this.skillDmg = skillDmg;
			this.specialDmg = specialDmg;
		}
		
		void showStatus() {
			System.out.println("----상태----");
			System.out.println("HP : "+hp+"/"+maxHP);
			System.out.println("MP : "+mp+"/"+maxMP);
		}
		
		
		void normalAttack() {
			System.out.println(name+"(이)가 기본공격을 실행");
			System.out.println("적에게 "+normalDmg+"만큼 피해를 입혔습니다.");
			showStatus();
		}
		
		boolean checkMp(int needMp) {
			if(mp<needMp) {return false;}
			else {return true;}
		}
		
		void skillAttack() {
			if(!checkMp(10)) {
				return;
			}
			System.out.println(name+"이(가) 스킬공격을 실행하였습니다.");
			System.out.println("적에게 "+skillDmg+"만큼 피해를 입혔습니다.");
			System.out.println("mp가 10만큼 줄어들었습니다.");
			mp-=10;
			showStatus();
		}
		
		void specialAttack() {
			if(!checkMp(10)) {
				return;
			}
			System.out.println(name+"이(가) 필살기 시전 중..");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("적에게 "+specialDmg+"만큼 피해를 입혔습니다.");
			mp-=10;
			hp-=10;
			
			revive();
			showStatus();
		}
		void revive() {
			if(hp<-0) {
				System.out.println("체력이 없어서 부활합니다.");
				hp = maxHP;
				mp = maxMP;
			}
		}
		
}



















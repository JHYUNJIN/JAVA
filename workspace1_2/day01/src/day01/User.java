package day01;

public class User {
	
	String name;
	int hp, mp, maxHp, maxMp, normalDmg, skillDmg, specialDmg;
	
	public User(String name, int maxHp, int maxMp, int normalDmg, int skillDmg, int specialDmg) {
		super();
		this.name = name;
		this.hp = maxHp;
		this.mp = maxMp;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.normalDmg = normalDmg;
		this.skillDmg = skillDmg;
		this.specialDmg = specialDmg;
	}
	
	boolean checkMp(int needMp) {
		if (mp>needMp) {
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean checkHp(int needHp) {
		if (hp>needHp) {
			return true;
		}
		else{
			return false;
		}
	}
	
	void status() {
		System.out.println("====="+name+"=====");
		System.out.println("HP("+hp+"/"+maxHp+")"+  "/"+"MP("+mp+"/"+maxMp+")");
	}
	
	void normalAttack() {
		System.out.println(name+"님꼐서 "+normalDmg+"만큼의 피해를 입혔습니다.");
	}
	
	void skillAttack() {
		if(checkMp(10)) {
			System.out.println("이도류, 도깨비 참수!");
			System.out.println(name+"님꼐서 "+skillDmg+"만큼의 피해를 입혔습니다.");
			mp-=10;
			status();
		}
		else {
			return;
		}
	}

	void specialAttack() {
		if(checkHp(10)){
			if(checkMp(20)) {
				System.out.println("삼도류, 삼천세계");
				System.out.println(name+"님꼐서 "+specialDmg+"만큼의 피해를 입혔습니다.");
				hp-=10;
				mp-=20;
				status();
			}
			else {
				System.out.println("마나가 부족합니다.");
			}
		}
		
	}
	
}
	

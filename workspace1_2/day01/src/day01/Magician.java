package day01;

public class Magician extends User {
	public Magician() {
		super("lord Grute",120,200,20,120,300);
	}
	
	

	@Override
	void normalAttack() {
		// TODO Auto-generated method stub
		super.normalAttack();
	}



	@Override
	void skillAttack() {
		if(checkMp(10)) {
			System.out.println("썬더볼트!");
			System.out.println(name+"님께서 "+skillDmg+"만큼의 피해를 입혔습니다.");
			mp-=10;
			status();
		}
		else {
			System.out.println("마나가 부족합니다.");
			return;
		}
	}

	@Override
	void specialAttack() {
		
		if(checkMp(30)) {
			System.out.println("메테오~");
			System.out.println(name+"님께서 "+specialDmg+"만큼의 피해를 입혔습니다.");
			mp-=30;
			status();
		}
		else {
			System.out.println("마나가 부족합니다.");
			return;
		}
	}
	
	
	
}

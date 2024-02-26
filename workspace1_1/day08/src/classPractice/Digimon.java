package classPractice;

import java.util.Random;

public class Digimon {

	String[] evolve = {"아구몬", "그레이몬","메탈 그레이몬","워 그레이몬"};
	
	String name;
	int hp;
	int exp;
	int feedCount;
	int evolution;

	public Digimon(String name) {
		this.name=name;
		hp=100;
		feedCount=10;
	}
	
	void sleep() {
		System.out.println(evolve[evolution]+"이(가) 잠자는 중..Zzz");
		for(int i=0;i<3;i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			System.out.println("Zz..");
		}
		System.out.println("잠에서 깨어났습니다.");
		hp+=hp+3;
	}
	
	void doEvolution() {
		if(evolution==3) {
			System.out.println("이미 최종 진화 단계입니다.");
			return;
		}
		
		if(this.exp<10) {
			System.out.println("경험치가 부족합니다.");
		}
		else {
		System.out.println(this.evolve[this.evolution]+" 진화~~~~"); // this는 접근한 객체의 주소를 담고있는데 사용할 때 this 생략해도 된다.
			for(int i=0;i<3;i++) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			}
		evolution++;
		System.out.println(this.evolve[this.evolution]+"~~~~~~~");
		}
	}
	
	void eat() {
		if(feedCount<1) {
			System.out.println("먹이가 부족합니다.\n");
		}
		else {
		feedCount--;
		hp+=hp+2;
		}
	}
	
	void fight() {
		if(hp<5) {
			System.out.println("먹이나 잠자기를 통해서 hp를 회복해주세요");
		}
		else {
			Random r = new Random();
			int[] percent = new int[10];
			int rating = 50;
			System.out.println("FIGHT!!...");
			for (int i = 0; i < rating/10; i++) {
				percent[i]=1;
			}
			if(percent[r.nextInt(percent.length)]==1) { // 사냥 대성공!
				System.out.println("이 구역의 적들을 쓸어버렸어!");
				exp=10;
			}
			else { // 일반적인 사냥
				System.out.println("사냥 성공!\n"+"힘든 싸움이었군..");
				hp -= 30;
				exp += 5;
			}
		}
	}
	
} // class Digimon 중괄호 영역

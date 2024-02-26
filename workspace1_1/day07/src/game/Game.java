package game;

import java.util.Scanner;

import javax.security.auth.login.CredentialException;

class Creature{
	// 캐릭터 이름
	String name;
	// hp
	int hp;
	// 밥먹은 수
	int eatCnt;
	// 턴
	int turn;
	// 변
	boolean poo; //true : o false : x
	
	// 먹기 : 1턴 증가, hp 2증가
	void eat() {
		this.turn++;
		this.hp +=2;
		this.eatCnt++;
	}
		
	// 자기 : 3초 동안 잠에 든다 hp 2감소, 턴 2증가
	void sleep() {
		for(int i=0;i<3;i++) {
			System.out.println("zzZ...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("잠에서 깨어났습니다.");
		this.hp -=2;
		this.turn +=2;
	}
	// 대변보기 : 밥을 3번 먹으면 실행, 변을 안치우면 1턴당 hp 1감소
	void poop() {
		System.out.println("끄으으응!!");
		this.poo = true;
		this.eatCnt =0;
	}
	// 청소하기 : 대변을 치운다. >>> poo == true >>> false
	void cleanUp() {
		System.out.println("청소중~~!! 룰루랄라");
		this.poo=false;
	}
	// 춤추기 : 1턴 증가 hp 1감소
	void dance() {
		System.out.println("댄스댄스댄스");
		this.turn++;
		this.hp--;
	}
	// 상태보기 : 
	void printState() {
		System.out.println(this.turn+"일차"); 
		System.out.println("이름 : "+this.name);
		System.out.println("hp : "+this.hp);
	}
		
		public Creature(String name, int hp) {
			this.name = name;
			this.hp = hp;
		}
		
		
public class Game{
	public static void main(String[] args) {
		String title = "☆★☆★☆★☆★☆★☆★☆★\n"
				+"☆★☆★☆다마고치★☆★☆★\n"
				+"☆★☆★☆★☆★☆★☆★☆★\n";
		String mainMsg = "1.캐릭터 선택\n"
		+"2. 종료\n"
				+"입력 : ";
		String charMsg = "1.피카츄\n"
				+"2.춘식이\n"
				+"3.무민\n"
				+"4.돌아가기\n";
		String gameMsg = "1.먹기\n"
				+"2.자기\n"
				+"3.청소하기\n"
				+"4.춤추기\n"
				+"5.상태확인\n"
				+"입력 : ";
				
		Scanner sc = new Scanner(System.in);
		int choice =0;
		int gameChoice=0;
		
		System.out.println(title);
		
		while(true) {
			System.out.println(mainMsg);
			choice = sc.nextInt();
			if(choice==2) {
				break;
			}
			System.out.println(charMsg);
			choice=sc.nextInt();
			if(choice==4) {
				continue;
			}
			Creature[] ct = {new Creature("피카츄",3),
					new Creature("춘식이",2),
					new Creature("무민",4)};
			
			while(true) {
				System.out.println(gameMsg);
				gameChoice = sc.nextInt();
				Creature myChar = null;
				if(choice==1) {
				}
				else if(choice==2) {
				}
				else if(choice==3) {
				}
				//1.먹기 2.자기 3.청소하기 4.춤추기 5.상태확인
				switch(gameChoice) {
				case 1:
					myChar.eat();
					System.out.println("냠냠..");
					break;
				case 2:
					myChar.sleep();
					break;
				case 3:
					myChar.cleanUp();
					break;
				case 4:
					myChar.dance();
					break;
				case 5:
					myChar.printState();
					break;
				default :
					System.out.println("잘못입력했습니다.");
					
				}
				if(myChar.eatCnt >=3) {
					myChar.poop(); //poop은 어디서 온거니 ?
				}
				if(myChar.poo) {
					System.out.println("변을 치워야합니다.");
					myChar.hp--;
				}
				if(myChar.turn>=10) {
					System.out.println("☆★☆★☆★☆★☆★☆★☆★");
					myChar.printState();
					System.out.println("☆★☆★☆★☆★☆★☆★☆★");
					
					System.out.println(myChar.hp >=5 ? "해피엔딩" : "게임오버");
					break;
				}
				if(myChar.hp<=0) {
					System.out.println("죽었습니다. GAME OVER");
					break;
				}
			}
		}
			
		}
		
	}
}


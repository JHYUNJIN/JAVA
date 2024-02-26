package classPractice;

import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {
		
		Digimon dg = new Digimon("현진");
		Scanner sc = new Scanner(System.in);
		int choice=0, exitChoice=0;
		boolean flag=false;

		String StartMsg="★☆★☆★☆★☆디지몬 세계를 구해줘~★☆★☆★☆★☆";
		String msg = "1. 상태확인\n"
				+ "2. 전투!!\n"
				+ "3. 현진아! 진화시켜줘~~\n"
				+ "4. 잠자기Zzz\n"
				+ "5. 먹기waguwagu\n"
				+ "6. 게임 종료\n";
		
		System.out.println(StartMsg);
		
		while(choice!=6) {
			flag=false;
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("이름 : "+ dg.name);
				System.out.println("진화 상태 : "+dg.evolve[dg.evolution]);
				System.out.println("hp : "+dg.hp);
				System.out.println("exp : "+dg.exp);
				System.out.println("보유 먹기 수 : "+dg.feedCount+"\n");
				break;
			case 2:
				dg.fight();
				break;
			case 3:
				dg.doEvolution();
				break;
			case 4:
				dg.sleep();
				break;
			case 5:
				System.out.println("밥먹는중..waguwagu\n");
				dg.eat();
				

				break;
			case 6:
				while(!flag) {
					System.out.println("디지몬 세계를 종료할까요 ? ");
					System.out.println("1. 계속 진행\n"
							+ "2. 종료");
					exitChoice=sc.nextInt();
					
					switch(exitChoice) {
					case 1:
						System.out.println("게임을 다시 진행합니다.");
						choice=0;
						exitChoice=0;
						flag=true;
						break;
					case 2:
						System.out.println("게임을 종료합니다.");
						flag=true;
						break;
					default:
						System.out.println("다시 입력해주세요.");
						break;
					}
				}
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		
		}
	
	
	
	}
}

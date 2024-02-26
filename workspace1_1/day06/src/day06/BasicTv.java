package day06;

import java.util.Scanner;

class Tv3{
	String color;
	int inch;
	int price;
	boolean pwr;
	int ch;


	
public Tv3(String color, int inch, int price, boolean pwr, int ch) {
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.pwr = pwr;
		this.ch = ch;
	}

	
	void powerOnOff() {
		pwr = !pwr;
	}
	int channelUp() {
		return ++ch;
	}
	int channelDw() {
		return --ch;
	}

public class BasicTv {
	public static void main(String[] args) {
		String msg = "1. 전원버튼\n"
				+"2. 채널올리기\n"
				+"3. 채널 내리기\n"
				+"입력 : ";
		Scanner sc = new Scanner(System.in);
		Tv3 tv = new Tv3("white",25,800000,false,5);
		int choice = 0;
		
		while(true) {
			System.out.println();
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(tv.pwr) {
					System.out.println("전원끄기");
				}
				else {
					System.out.println("전원켜기");
				}
				tv.powerOnOff();
				break;
			case 2:
				if(tv.pwr) {
					System.out.println("채널 : "+tv.channelUp());
					
				}
				break;
				
			case 3:
				if(tv.pwr && tv.ch>1) {
					System.out.println("채널 : "+tv.channelDw());
					
				}
				break;
			default:
				System.out.println("잘못입력했습니다.");
			}
			
		}
	}
}}
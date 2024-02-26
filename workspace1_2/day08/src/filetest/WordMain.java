package filetest;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		System.out.println("영어단어장");
		System.out.println("print : 영단어 출력");
		System.out.println("find : 영단어 검색");
		System.out.println("save : 영단어 파일저장");
		System.out.println("exit : 종료");
		
		Scanner sc = new Scanner(System.in);
		
		WordController wc = new WordController();
		wc.setList(new ArrayList<Word>());
		
		String file="vocabook.txt";
		wc.read(file);
		
		while(true) {
			System.out.println("영단어 또는 메뉴를 입력하세요.");
			String eng = sc.next();
			if(eng.equals("exit")) break;
			
			switch (eng) {
			case "print":
				wc.list();
				break;

			case "find":
				if(!wc.find())System.out.println("찾는 단어가 없습니다.");
				
			case "save":
				wc.save(file);
				
			default:
				wc.insert(eng);
			}
		}
		
		
	}
}

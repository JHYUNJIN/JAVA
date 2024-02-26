package words;

import java.util.ArrayList;
import java.util.Scanner;

public class VocaMain {
public static void main(String[] args) {
	System.out.println("❤️[영어단어장]❤️");
	System.out.println("print:영단어 출력");
	System.out.println("find:영단어 검색");
	System.out.println("exit:종료");

	Scanner sc = new Scanner(System.in);
	ArrayList<Voca> list = new ArrayList<>();

	while(true) {
		System.out.println("🎬영어단어 또는 메뉴를 입력하세요.");
		String eng =sc.next();
		if(eng.equals("exit"))break;
		switch(eng) {
		case "print":
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
//				System.out.println(list.get(i).getEng()+"/"+list.get(i).getKor());
			}
			break;
		case "find":
			System.out.println("찾는 단어를 입력하세요.");
			String find = sc.next();
			boolean isFind = false;
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getEng().equals(find));{
					
				System.out.println(find+" 단어를 찾았습니다.");
				System.out.println(list.get(i));
				isFind=true;
				}
			}
			if(!isFind) {
				System.out.println(find+"찾는 단어가 없습니다.");
			}
			break;
		default:
			System.out.println("뜻을 입력하세요.");
			String kor=sc.next();
			System.out.println("레벨을 입력하세요.");
			int level = sc.nextInt();
			System.out.println("날짜를 입력하세요.");
			String reg_String = sc.next();
			
			Voca w= new Voca(eng,kor,level,reg_String);
			System.out.println();
			
		}
			
	}




}
}

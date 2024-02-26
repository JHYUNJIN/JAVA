package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException{
//		절대 경로 : 내가 어디에 위치해 있던 무조건 찾아가는 경로
//		상대 경로 : 내가 있는 위치에 따라 변하는 경로 -> ..(이전경로), .(현재경로)
//		자바에서 기본 현재경로는 프로젝트 폴더이다.
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.txt")));
		
		bw.write("안녕하세요. 반갑습니다.\n");
		bw.write("오늘의 점심메뉴는\n");
		bw.write("봉골레파스타하나\n");
		bw.newLine();
		bw.write("아이스음메리콰노");
		bw.newLine();
		bw.write("스테이크");
		
//		bw.flush(); // --> 버퍼에 있는 데이터를 전송한다.
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
//		System.out.println((char)br.read()); // 한글자 읽어옴
		System.out.println(br.readLine()); // 한줄 읽어옴
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

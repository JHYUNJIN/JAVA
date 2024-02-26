package phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Phone {
	static String fname = "c:\\temp\\juso.txt"; // 전역변수 선언, 정적 초기화

	static class Address {
		String name;
		String age;
		String phone_number;

		Address(String name, String age, String phone_number) {
			this.name = name;
			this.age = age;
			this.phone_number = phone_number ;
		}
	}
// static 해줘야 프로그램을 종료해도 메모리에 남아있는다.
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String print_menu="1. 연락처 보기\n"
				+"2. 연락처 등록\n"
				+ "3. 연락처 수정\n"
				+ "4. 연락처 삭제\n"
				+ "5. 나가기\n";
		String select = "";		
		
		System.out.printf("전화번호부\n");
				

		while (select != "5") {
			System.out.println(print_menu);
			select = sc.next();

			switch (select) {
			case "1":
				view_juso();
				break;
			case "2":
				add_juso();
			case "3":
				modify_adress();
				break;
			case "4":
				delete_juso();
				break;
			case "5":
				return;
			default:
				System.out.printf("\n 잘못 입력했어요.\n");
			}
		}
	}

//	static void print_menu() {
//		System.out.printf("\n");
//		System.out.printf("1. 연락처 출력 \n");
//		System.out.printf("2. 연락처 등록 \n");
//		System.out.printf("3. 연락처 삭제 \n");
//		System.out.printf("4. 끝내기 \n");
//	}

	static void view_juso() throws IOException {
		// 연락처 보기 , 이름순으로 정렬해서 보여지게 해보자!
		String str = "";
		File f = new File(fname);
		if (!f.exists()) {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}

		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;
		for (i = 1;; i++) 
		{
			if (!br.ready()) // ready() == feof(), 파일을 읽을 수 없으면(파일이 없거나 모든 내용을 읽었다면) 
				break; // for 구문을 빠져나가라 
			else { // 그렇지 않으면
				str = br.readLine(); // 한줄씩 읽어와라
				System.out.printf("%2d:  %s\n", i, str); //1: 이름 나이 전화번호
			}
		}

		if (i == 1) // 연락처가 없다면
			System.out.printf("\n ** 연락처 파일에 전화번호가 없어요. **\n");

		br.close();
	}

	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		Address adress = new Address("", "", "");

		String wstr = "";

		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));

		System.out.print("이름 : ");
		adress.name = sc.nextLine();
		System.out.print("나이 : ");
		adress.age = sc.nextLine();
		System.out.print("전화번호 : ");
		adress.phone_number = sc.nextLine();

		wstr = adress.name + "\t" + adress.age + "\t" + adress.phone_number;

		bw.write(wstr);
		bw.newLine();

		bw.close();
	}
	
	static void modify_adress() throws IOException{
		//연락처 수정 코드 입력해보자
	}

	static void delete_juso() throws IOException { // 삭제하기 위해서는 읽기/쓰기 두가지기능 모두 필요하다.
		//읽어와야 볼것이고 쓸수있어야 지울수있으니까
		Scanner sc = new Scanner(System.in); // 삭제할 행번호
		String[] read_str = new String[50];	//배열의 길이값
		String str = "";
		int del_line, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));

		if (!br.ready()) { 
			System.out.printf("\n!! 저장된 연락처가 없습니다. !!\n");
			return;
		}

		System.out.printf("\n삭제할 행 번호를 입력해주세요. ");
		//삭제할 연락처의 이름을 입력해주세요. 로 수정해보자
		del_line = sc.nextInt();

		for (i = 0; i < 50; i++) 
		{
			if ((str = br.readLine()) == null)
				break;

			if (i + 1 != del_line) 
			{
				read_str[count] = str;
				count++;
			} else
				System.out.printf("%d 행이 삭제되었습니다. \n", del_line);
			// 000님의 연락처가 삭제되었습니다.로 수정해보자
		}

		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));

		for (i = 0; i < count; i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}

		bw.close();
	}

}
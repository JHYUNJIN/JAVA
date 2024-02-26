package filetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WordController {
	private ArrayList<Word> list;

	public ArrayList<Word> getList() {
		return list;
	}

	public void setList(ArrayList<Word> list) {
		this.list = list;
	}
	
	public void insert(String eng) {
		String kor,reg_date;
		int level;
		Word w;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("뜻을 입력하세요.");
		kor=sc.next();
		System.out.println("레벨을 입력하세요.");
		level=sc.nextInt();
		System.out.println("날짜를 입력하세요.");
		reg_date=sc.next();
		w = new Word(eng,kor,level,reg_date);
		list.add(w);
	}
	
	public void list() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public boolean find() {
		Scanner sc = new Scanner(System.in);
		boolean isFind = false;
		System.out.println("찾는 단어를 입력하세요.");
		String find = sc.next();
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getEng().equals(find)) {
				System.out.println("단어를 찾았습니다.");
				System.out.println(list.get(i));
				isFind=true;
			}
		}
		return isFind;
	}
	
	public void save(String file) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(file));
			for(Word w : list) {
				pw.println(w);
			}
			System.out.println("저장되었습니다.");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void read(String file) {
		Scanner sc = null;
		String tmp;
		String[] ar;
		String eng,kor,reg_date;
		int lev;
		
		try {
			sc=new Scanner(new FileInputStream(file));
			while(sc.hasNextLine()) {
				tmp=sc.nextLine();
				ar=tmp.split(", ");
				Word w = new Word(ar[0],ar[1],Integer.parseInt(ar[2]),ar[3]);
				list.add(w);
			}
		}
		 catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}

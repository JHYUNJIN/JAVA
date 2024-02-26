package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File4 {
	public static void main(String[] args) {
		
		String file = "output.txt";
		
		try {
			Scanner sc = new Scanner(new FileInputStream(file));
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package file;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File f = new File("input.txt");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.length());
		
		
		File dir1 = new File("C:\\Users\\Springonward\\Desktop\\CodingStudy\\JAVA_1400_JHJ\\workspace2\\day08\\test");
		dir1.mkdir();
		File f2 = new File(dir1,"input2.txt");
		
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f2.getPath());
		System.out.println(f2.getAbsolutePath());
		
	}
}

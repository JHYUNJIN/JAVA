package file;

import java.io.FileWriter;
import java.io.IOException;

public class File3 {
	public static void main(String[] args) {
		String str = "내일은 월요일 출근해야지 ^ ^*";
		
		try {
			FileWriter fw = new FileWriter("output.txt");
			fw.write(str.charAt(0));
			fw.write("\n");
			fw.write(str);
			fw.write("\n");
			fw.write(str.charAt(0));
			fw.write("일이 월요일이네 ?");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

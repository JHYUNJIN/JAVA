package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
		   //현재 경로에 animal.txt 파일을 생성하고,
		   //파일 내용은 사슴, 고라니, 너구리, 토끼 네 가지 동물을 작성한다.
		   //각 동물은 줄바꿈 후 다음 동물을 넣도록한다.
		   //반복문을 사용하여 데이터를 출력한다.
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
		
		bw.write("사슴\n");
		bw.write("고라니\n");
		bw.write("너구리\n");
		bw.write("토끼\n");
		
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(new File("animal.txt")));
		/*
		 * for (int i = 0; i < 4; i++) { System.out.println(br.readLine()); }
		 */

		while(br.readLine() != null) {
			// 여기서 변수를 만들어주지 않으면 readline이 조건식에서 사용이 되어 비교된 readline은 출력이 안된다는거죠
			System.out.println(br.readLine());
		}
		br.close();
	}
}


/*
package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
   public static void main(String[] args) throws IOException{
      //현재 경로에 animal.txt 파일을 생성하고,
      //파일 내용은 사슴, 고라니, 너구리, 토끼 네 가지 동물을 작성한다.
      //각 동물은 줄바꿈 후 다음 동물을 넣도록한다.
      //반복문을 사용하여 데이터를 출력한다.
      
      BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
      
      String[] animals = {"사슴", "고라니", "너구리", "토끼"};
      
      for (int i = 0; i < animals.length; i++) {
         bw.write(animals[i]);
         bw.newLine();
      }
      bw.close();
      
      BufferedReader br = new BufferedReader(new FileReader(new File("animal.txt")));
      String line = null;
      
      while((line = br.readLine()) != null) {
         System.out.println(line);
      }
      br.close();
      
//      while(br.ready()) {
//         System.out.println(br.readLine());
//      }
//      br.close();
         
   }
}

*/
package day01;

import java.io.FileInputStream;

public class FileIO {
   public static void main(String[] args) throws Exception{
      FileInputStream fis = new FileInputStream("d://javaVoc//data1.txt");
      
      int ch;
      byte[] bt = new byte[1024];
      
      int i = 0; // 배열의 인덱스 값 초기화 
      
      while((ch = fis.read()) != -1) {// 파일에서 문자 하나를 읽어 온다. 파일의 끝일 경우 -1반환
           bt[i] = (byte)ch;
      
           i++;
      }
      System.out.print(new String(bt));
      fis.close();      
   }
}
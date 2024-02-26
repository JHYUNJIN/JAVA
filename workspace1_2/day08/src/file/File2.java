package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File2 {
	public static void main(String[] args) {
		byte[] ar1 = new byte[20]; //20byte
		byte[] ar2 = new byte[20]; //20byte

		try {
			FileInputStream fis = new FileInputStream("input.txt");
			System.out.print((char)fis.read());
			fis.read(ar1,0,6);
			for(byte b:ar1) {
				System.out.print((char)b+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}

package filetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductFile {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		
		String file = "product.txt";
		
			try {
				Scanner sc = new Scanner(new FileInputStream(file));
				while(sc.hasNextLine()) {
					String str = sc.nextLine();
					String[] ar1 = str.split(",");
					int i = 0;
					Product p = new Product(ar1[i],Integer.parseInt(ar1[i+1]),ar1[i+2]);
					list.add(p);
					
				}
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

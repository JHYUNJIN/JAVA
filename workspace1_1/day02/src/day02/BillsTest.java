package day02;

import java.util.Scanner;

public class BillsTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String item1 = "chocolat";
		String item2 = "icecream";
		String item3 = "water";

		int price1 = 1000;
		int price2 = 1500;
		int price3 = 800;
		
		
		System.out.printf("chocolat 1ea = 1000won : ");
		int ea1 = sc.nextInt();
		System.out.printf("chocolat %dea = %dwon\n\n",ea1,price1*ea1);
		
		System.out.printf("icecream 1ea = 1500won : ");
		int ea2 = sc.nextInt();
		System.out.printf("icecream %dea = %dwon\n\n",ea2,price2*ea2);
		
		System.out.printf("water\t 1ea = 800won : ");
		int ea3 = sc.nextInt();
		System.out.printf("water\t %dea = %dwon\n",ea3,price3*ea3);
		
		int price1_1 = price1 * ea1;
		int price2_2 = price2 * ea2;
		int price3_3 = price3 * ea3;


		System.out.println("\n\nbill\t");
		System.out.println("=============================");
		System.out.printf("%s\t %dea\t %d\n", item1, ea1, price1 * ea1);
		System.out.printf("%s\t %dea\t %d\n", item2, ea2, price2 * ea2);
		System.out.printf("%s\t\t %dea\t %d\n", item3, ea3, price3 * ea3);
		System.out.println("=============================");
		System.out.printf("합계\t\t\t\s%d",price1_1+price2_2+price3_3);
		
	}

}

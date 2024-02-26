package access2;

import access1.Access1;
public class Access2 extends Access1 {
		
		void test() {
			super.printData3();
			System.out.println(super.data3);
		}
		
		public static void main(String[] args) {
			Access2 a2 = new Access2();
			
			a2.test();

	}
}

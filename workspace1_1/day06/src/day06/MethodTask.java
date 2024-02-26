package day06;


public class MethodTask {
	//음수를 양수로 양수를 음수로 바꿔서 반환하는 메소드

	int change(int num) {
		int result = num*-1;
				return result;
	}
		String changeCase(String str) {
			char c = ' ';
			String result = "";
			for(int i=0; i<str.length();i++) {
				c=str.charAt(i);
				if(c >=97 && c<=122) { // 소문자 범위
					result += (char)(c-32); //소문자를 대문자로 바꾸는 것 
				}
				else if(c>=65 && c<=90 ) { // 대문자 범위
					result += (char)(c+32); //대문자를 소문자로 바꾸는 것
				}
				else {
					result = "잘못된 값입니다.";
					return result;
				}
			}
			return result;
}
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		int a = mt.change(4);
		System.out.println(a);
		
		String ban = mt.changeCase("BaNanA"); 
		System.out.println(ban);
		// 소문자를 대문자로, 대문자를 소문자로 바꿔서 반환하는 메소드
		// BaNanA --> bAnANa
	
		
		
		
		
//		package day06;
//
//
//		public class MethodTask {
//		   // 음수를 양수로 양수를 음수로 바꿔서 반환하는 메소드
//		   int change(int num) {
//		      return num*-1; 
//		   }
//		   
//		   
//		   // 소문자를 대문자로, 대문자를 소문자로 바꿔서 반환하는 메소드(같이)
//		      //BaNanA -> bAnANa
//		   String changeCase(String str) {
//		      char c = ' ';
//		      String result = "";
//		      for(int i=0; i<str.length();i++) {
//		         c = str.charAt(i);
//		         if(c >= 97 && c<=122) {   //소문자 범위
//		            result += (char)(c-32);   //소문자를 대문자로
//		         }
//		         else if(c>=65 && c<= 90) {   //대문자 범위
//		            result += (char)(c+32);   // 대문자를 소문자로
//		         }else {
//		            result = "잘못된 값입니다.";
//		            return result;
//		         }
//		      }
//		      return result;
//		   }
//		   public static void main(String[] args) {
//		      MethodTask mt = new MethodTask();
//		      int a= mt.change(4);
//		      System.out.println(a);
//		      
//		      String ban = mt.changeCase("abc안녕");
//		      System.out.println(ban);
//		   }
//		}










		
		
		
		
		
		
	
	
	
	
	
	}
}

package collectionTasj;

public class WebPage {
	public static void main(String[] args) {
		
		
	}

}


/*
package collectionTask;

public class WebPage {
   public static void main(String[] args) {
      
      UserService service = new UserService();
      User user = new User("hogeun", "1234", "류호근", 22);
      User user1 = new User("hogeun", "1234", "류호근", 22);
      service.join(user);
      
      if(service.checkId(user.getId())) {
         service.join(user1);
         System.out.println(user);
         System.out.println("회원가입이 정상적으로 완료되었습니다!");
      } else {
         System.out.println("중복된 아이디가 존재합니다!");
      }
      
      user = service.login("hogeun", "1234");
      
      if(user != null) {
         System.out.println(user.getName()+ "님 환영합니다.");
      } else {
         System.out.println("아이디와 비밀번호를 확인하세요!");
      }
      
   }
}
*/
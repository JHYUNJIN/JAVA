package collectionTasj;

import java.util.ArrayList;

public class UserService {

	//모든회원정보를 저장할 dB
	public static ArrayList<User> userList = new ArrayList<>();
	//id중복검사, boolean 타입으로 리턴
	public boolean checkId(String id) {
		for (User user : UserService.userList) {
			if(user.getId().equals(id)) {
				return false;
			}			
		}
		return true;
	}
	
	//회원가입, add
	public void add(User user) {
		userList.add(user);
	}
	
	//로그인
	// 매개변수로는 id, pw
	// 리턴타입 User
	// 없으면 null 리턴
	public User login(String id, String pw) {
		for (User user : userList) {
			if(user.getId().equals(id)&&user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}
	
	
	
}

/*
 * package collectionTask;

import java.util.ArrayList;

public class UserService {
//   모든 회원정보를 저장할 DB
   public static ArrayList<User> userList = new ArrayList<User>();
   
//   id중복검사, boolean 타입으로 리턴
   public boolean checkId(String id) {
      for (User user : userList) {
         if(user.getId().equals(id)) {
            return false;
         }
      }
      return true;
   }
   
   
//   회원가입, add
   public void join(User user) {
      userList.add(user);
   }
   
//   로그인 
//   매개변수로는 id, pw
//   리턴 타입 User
//   없으면 null 리턴
   public User login(String id, String pw) {
      for (User user : userList) {
         if(user.getId().equals(id) && user.getPw().equals(pw)) {
            return user;
         }
      }
      return null;
   }
   
   
   
   
   
   
   
}
*/

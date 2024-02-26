package listTask2;

import java.util.ArrayList;

public class UserService {
	private ArrayList<UserVO> userList = new ArrayList<>();
	
//	ID 중복검사 코드
	public boolean checkId(String id) {
		for(UserVO user : userList) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	
	}
//	회원가입 코드
	public void join(UserVO user) {
		userList.add(user);
	}
	
//	로그인 코드
	public UserVO login(String id, String pw) {
		for(UserVO user : userList) {
			if(user.getId().equals(id)&&user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}
	public ArrayList<UserVO> getUserList() {
		return userList;
	}
	
}

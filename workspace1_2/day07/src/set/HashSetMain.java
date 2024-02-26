package set;

import java.util.HashSet;

public class HashSetMain {
	public static void main(String[] args) {
		HashSet<TextMsg> msgSet = new HashSet<>();
		
//		메세지 객체 생성
		TextMsg msg1 = new TextMsg(1001, "안녕하세요");
		TextMsg msg2 = new TextMsg(1001, "안녕하세요");
		TextMsg msg3 = new TextMsg(1001, "안녕하세요");
		TextMsg msg4 = new TextMsg(1002, "안녕하세요");
		TextMsg msg5 = new TextMsg(1003, "안녕하세요");

//		set에 추가
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
//		저장된 사이즈
		System.out.println("사이즈 : "+msgSet.size());
		
//		출력
		for(TextMsg msg:msgSet) {
			System.out.println("번호 : "+msg.getMsgNo()+" 메세지 : "+msg.getMsg());
		}
		
		
	}
}

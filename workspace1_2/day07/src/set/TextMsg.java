package set;

public class TextMsg {
//	메세지를 식별하는 번호
	private int msgNo;
//	메세지 내용
	private String msg;
public TextMsg(int msgNo, String msg) {
	super();
	this.msgNo = msgNo;
	this.msg = msg;
	
	
	
}
public int getMsgNo() { //컨트롤 쉬프트 s r
	return msgNo;
}
public String getMsg() {
	return msg;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return msgNo;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof TextMsg) {
		TextMsg compare = (TextMsg)obj;
		if(this.msg.equals(compare.getMsg())) {
			return true;
		}
		else {
			return false;
		}
	}
	return false;
}
	
}

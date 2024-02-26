package casting;
class Tv{
	int vol;
	int ch;
	boolean power;
	
	void chUp() {}
	void chDown() {}
	void volUp() {}
	void volDown() {}
	void powerOnOff() {}
}
class SmartTv extends Tv{
	void netflix() {}
}
public class CastingTest {
	public static void main(String[] args) {
		//업캐스팅
		SmartTv st = new SmartTv();
	//  자료형   변수명 = 값;
		
		Tv tv = (Tv)st;
		Tv tv1 = (Tv)new SmartTv();
		Tv tv2 = new SmartTv();
		Tv tv4 = new Tv();
	//	부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다.
		//	부모클래스 타입의 참조변수에 자식클래스 타입의 주소값을 저장한다.
		new SmartTv().ch=10;
		System.out.println(new SmartTv().ch); // 변수에 담지 않아 불러 올수 없으며 서로 다른 주소 값이다.
		//잘 못된 다운 캐스팅
		SmartTv tv3 = (SmartTv)tv2; // 다운 캐스팅
		tv3.netflix();
		
		Tv tvtv = new SmartTv();//업 캐스팅
		
		//다운캐스팅
		SmartTv smartTv = (SmartTv)tvtv;
		
	}

}

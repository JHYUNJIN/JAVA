package day06;
class Tv{
	int ch;
	int vol;
	boolean power;
	int inch;
	int price;
	String color;
	
	void powerOnOff() {}
	void chUp() {}
	void chDw() {}
	
	public Tv(int ch, int vol, boolean power, int inch, int price, String color) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.inch = inch;
		this.price = price;
		this.color = color;
	}

	// ctrl + shift + s --> o --> g
	
	
}
public class TvTest {
	public static void main(String[] args) {
//		Tv samsungTv = new Tv();
//		samsungTv.ch=10;
//		samsungTv.vol=5;
//		samsungTv.power=false;
//		samsungTv.inch=80;
//		samsungTv.price=6000000;
//		samsungTv.color="white";
		Tv samsungTv = new Tv(10,5,false,80,600,"white");
		Tv lgTv = new Tv(5,5,false,100,800,"black");
		
		System.out.println(lgTv.color);
		
		
		
	}
}

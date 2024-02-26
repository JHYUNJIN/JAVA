package car;

public class Main {
	public static void main(String[] args) {
		Sedan sonata = new Sedan();
		Truck porter = new Truck();
		
		sonata.upSpeed(260);
		porter.upSpeed(180);
		
		sonata.seatNum=5;
		porter.capacity=12;
		
		System.out.println("소나타의 최대속도는 "+sonata.speed+"km, 탑승 가능인원은 "
				+sonata.getSeatNum()+"명 입니다.");
		System.out.println("포터의 최대속도는 "+porter.speed+"km, 탑승 가능인원은 "
				+porter.getCapacity()+"명 입니다.");
		
		
	}
}

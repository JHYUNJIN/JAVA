package car;

public class Main {
	public static void main(String[] args) {
		
	Sedan sonata = new Sedan("HYUNDAE","SONATA",0,260);
	Coupe carrera = new Coupe("PHORCHE","CARRERA",0,330);
	
	
	
	sonata.on_engine();
	sonata.up_speed(50);
	sonata.down_speed(10);
//	sonata.off_engine();
	
	carrera.on_engine();
	carrera.on_roof();
	carrera.off_roof();
	carrera.up_speed(100);
	carrera.down_speed(20);
//	carrera.off_engine();
	
	
	
	
	
	System.out.println(sonata.toString());
	System.out.println(carrera.toString());
	
	
	}
}

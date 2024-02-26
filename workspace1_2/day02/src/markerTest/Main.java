package markerTest;

public class Main {
	void checkA(Animal animal) {
		if(animal instanceof Canivore) {
			
			System.out.println("육식동물");
		}
		else if(animal instanceof Herbivore) {
			System.out.println("초식동물");
		}
	}
	void checkB(Animal[] animals) {
		for(int i=0;i<animals.length;i++) {
			if(animals[i] instanceof Sky) {
				System.out.println("날아다닌다");
			}
			else if(animals[i] instanceof Land) {
				System.out.println("뛰어다닌다.");
			}
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		Animal[] animals = {
				new Eagle(),
				new Horse(),
				new Tiger()
		};
		Animal[] animals2 = {
				new Eagle(),
				new Horse(),
				new Eagle(),
				new Tiger(),
				new Horse(),
				new Horse(),
				new Horse(),
				new Tiger()
		};
		Eagle animal3 = new Eagle();
		animal3.getAge();
		animal3.setAge(20);
		animal3.setName("대머리");
		m.checkA(animals[0]);
		m.checkA(animals[1]);
		m.checkA(animals[2]);
		m.checkB(animals);
		System.out.println("=========");
		m.checkB(animals2);
		System.out.println(animal3.toString());
		
		
		
	}
}

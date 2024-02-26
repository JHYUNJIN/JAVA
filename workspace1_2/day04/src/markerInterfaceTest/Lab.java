package markerInterfaceTest;

public class Lab {
//	외부에서 모든 동물을 받아와서
//	초식동물인지 육식동물인지 그리고 잡식동물인지 구분하는 메소드
//	초식동물 : Herbivore
//	육식동물 : Carnivore
	
	public void checkKind(Animal[] animals) {
		for(int i=0;i<animals.length;i++) {
			if(animals[i] instanceof HerbivoreMarker) {
				System.out.println("초식동물입니다.");
			}
			else if (animals[i] instanceof CarnivoreMarker) {
				System.out.println("육식동물입니다.");
			}
			else {
				System.out.println("잡식동물입니다.");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Lab lab = new Lab();
		
		Animal[] animals= {
				new Bear(),
				new Cow(),
				new Dog(),
				new Tiger()
		};
		
		lab.checkKind(animals);
		
		
		
	}
}

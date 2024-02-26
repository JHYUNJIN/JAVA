package markerTest;

public class Eagle extends Canivore implements Sky {
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		
		return "독수리 이름 : "+name+"\n독수리 나이 : "+age;
	}





}


package hashset;

public class Member {

	public String name;
	public int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return(target.name==name&&target.age==age);
		}
		else
			return false;
	}
	
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
	
	
}

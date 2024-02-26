package set;

public class Student /*extends Object 업캐스팅 생략되어있음*/ {
	int num;
	String name;
	
	public Student(int num, String name) {
		this.num=num;
		this.name=name;
	}
	@Override
	public boolean equals(Object/*업캐스팅*/ obj) {
		// TODO Auto-generated method stub
		if(this==obj) {return true;}
		if(obj instanceof Student) {
			return this.num==((Student/*다운캐스팅*/)obj).num && this.name.equals(((Student)obj).name); 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.num;
	}
	
}

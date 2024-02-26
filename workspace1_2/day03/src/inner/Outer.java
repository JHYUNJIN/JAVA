package inner;

public class Outer {
	int instanceVariable;
	static int staticVariable;
	
	void instanceMethod() {
		int localVariable;
		class LocalInner{}
		
		LocalInner li = new LocalInner();
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
	}
	
	class InstanceInner{}
	static class StaticInner{}
	
}

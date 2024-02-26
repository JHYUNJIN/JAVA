package generic;

class Bob{
	void add(int a, int b) {
		System.out.println(a+b);
	}
}


public class BoxMain {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content="Java";
		String str = box1.content;
		System.out.println(str);
		
	
	Box<Integer> box2 = new Box<>();
	box2.content=2;
	int num = box2.content;
	System.out.println(num);
	
	Bob box3 = new Bob();
	box3.add(1, 2);

	
	
	
	}
}



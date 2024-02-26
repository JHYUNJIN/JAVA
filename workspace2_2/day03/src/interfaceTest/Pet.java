package interfaceTest;

public interface Pet {
//	추상메소드는 구현이 되기 전 메모리에 올릴 수 없기 때문에
//	우리가 상수를 사용하기 위해서는 static을 붙여주는 방법 밖에 없다.
	
	final static int eyes=2;
//	final static 생략 가능
	int mouth = 1;
	
//	abstract 생략가능
//	추상메소드만! 가질 수 있는 interface의 특성상 추상메소드와 일반메소드를 구분하지 않아도 된다.
	public abstract void sitDown();
	public void turn();
	public void hand();
	public void holdOn();
}

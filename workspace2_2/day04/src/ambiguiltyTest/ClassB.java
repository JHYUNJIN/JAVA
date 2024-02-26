package ambiguiltyTest;

public class ClassB extends ClassA implements InterfaceA {

	@Override
	public void printData() {
		InterfaceA.super.printData();
	}
}

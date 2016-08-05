
public class C3 implements Int1, Int3 {

	@Override
	public void sayHi(String st) {
		// TODO Auto-generated method stub
		System.out.println("Hi " + st);
	}

	@Override
	public void sayHello(String txt) {
		// TODO Auto-generated method stub
		System.out.println("Hello " + txt);
	}

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Sum is: " + (x+y));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Difference is: " + (a-b));


	}

}

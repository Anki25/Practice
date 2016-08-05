
public class C2 implements Int2, Int3 {

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
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Product is: " + (a*b));
	}

	@Override
	public void div(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Quotient is: " + (x/y));
	}

}

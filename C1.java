
public class C1 implements Int2, Int1 {

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

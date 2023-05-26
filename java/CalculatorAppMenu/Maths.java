
public class Maths {
	int result;

	public void add (int a,int b) {
		
		result = a+b;
		System.out.println("The Addition is "+ result);
	}

	public void subtract(int a,int b) {
		result = a-b;
		System.out.println("The differenct is "+ result);
	}
	
	public void multiply(int a,int b) {
		result = a*b;
		System.out.println("The multiplication is "+ result);
	}
	
	public void divide(int a,int b) {
		result = a/b;
		System.out.println("The division is "+ result);
	}
	
	public void square(int a) {
		result = a*a;
		System.out.println("The squre is "+ result);
	}
	
	public void cube(int a) {
		result = a*a*a;
		System.out.println("The cube is "+ result);
	}
	
}

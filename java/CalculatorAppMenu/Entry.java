import java.io.IOException;

public class Entry {
	public static void main(String[] args) throws IOException{
//		int a = 100;
//		int b = 200;
//		Maths m = new Maths();
//		m.add(a, b);
//		m.subtract(b, a);
//		m.multiply(a, b);
//		m.divide(b, a);
//		m.square(a);
//		m.cube(a);
	
		System.out.println("Please Enter 1st Number");
		//BasicInput bi = new BasicInput();
		int number1 = BasicInput.readInteger();
		
		System.out.println("Please Enter 2st Number");
		int number2 = BasicInput.readInteger();
		
		Maths m = new Maths();
		m.add(number1, number2);
		
		
		
		
	}
}

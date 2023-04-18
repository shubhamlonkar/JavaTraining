
public class Entry {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		Maths m = new Maths();
		m.add(a, b);
		m.subtract(b, a);
		m.multiply(a, b);
		m.divide(b, a);
		m.square(a);
		m.cube(a);
	}
}

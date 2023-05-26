import java.io.IOException;

public class Menu {
	/*
	  public int show()
	  will show a menu and accept the choice
	   1. Add
	   2. Subtract
	   3. Multiply
	   4. Divide
	   // Please enter your choice
	   */
	
	public int show() throws IOException {
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square\n6.Cube\nEnter your choice");
		int choice = BasicInput.readInteger();
		Maths m = new Maths();
		int number1,number2;
		switch(choice) {
			case 1:
				System.out.println("Please Enter 1st Number");
				 number1 = BasicInput.readInteger();
				
				System.out.println("Please Enter 2st Number");
				 number2 = BasicInput.readInteger();
								
				m.add(number1, number2);
				break;
			case 2:
				System.out.println("Please Enter 1st Number");
				number1 = BasicInput.readInteger();
				
				System.out.println("Please Enter 2st Number");
				number2 = BasicInput.readInteger();
								
				m.subtract(number1, number2);
				break;
			case 3:
				System.out.println("Please Enter 1st Number");
				number1 = BasicInput.readInteger();
				
				System.out.println("Please Enter 2st Number");
				number2 = BasicInput.readInteger();
								
				m.multiply(number1, number2);
				break;
			case 4:
				System.out.println("Please Enter 1st Number");
				number1 = BasicInput.readInteger();
				
				System.out.println("Please Enter 2st Number");
				number2 = BasicInput.readInteger();
								
				m.divide(number1, number2);
				break;
			case 5:
				System.out.println("Please Enter Number to be squared");
				number1 = BasicInput.readInteger();
				
				m.square(number1);
				break;
			case 6:
				System.out.println("Please Enter Number to be cubed");
				number1 = BasicInput.readInteger();
				
				m.cube(number1);
				break;
		}
		
		
		return 0;
		
	}
}

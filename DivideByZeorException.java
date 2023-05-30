package Questions;

public class DivideByZeorException {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println("Quotient : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: Division by zero");
		}
	}

}

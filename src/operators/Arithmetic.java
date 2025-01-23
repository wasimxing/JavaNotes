package operators;

public class Arithmetic {

	/**
	 * 
Arithmetic operators in Java are used to perform mathematical operations on numeric data types like int, float, double, etc.

List of Arithmetic Operators:
Operator	Description	Example
+	Addition	x + y (adds x and y)
-	Subtraction	x - y (subtracts y from x)
*	Multiplication	x * y (multiplies x and y)
/	Division	x / y (divides x by y)
%	Modulus (remainder)	x % y (remainder when x is divided by y)
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		System.out.println(addition(10, 20));
		System.out.println(subtraction(10, 20));
		System.out.println(multiplication(10, 20));
		System.out.println(division(101, 2));
		System.out.println(modulus(101, 2));

	}
	static int addition(int a, int b) {
		return a+b;
	}
	static int subtraction(int a, int b) {
		return a-b;
	}
	static int multiplication(int a, int b) {
		return a*b;
	}
	static int division(int a, int b) {
		return a/b;
	}
	static int modulus(int a, int b) {
		return a%b;
	}

}

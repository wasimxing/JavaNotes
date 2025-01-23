package operators;

public class RelationalOperator {
	/**
	 * in relational operator (Comparison) and return type is boolean greater than > less than <
	 * greater than equal to >= less than equal to <= equal to == not equal to !=
	 * 
	 * Key Points: Data Types:
	 * 
	 * Relational operators work with primitive data types like int, float, double,
	 * char. They do not work directly with objects or boolean types (except == and
	 * != for equality comparison). Usage with Boolean:
	 * 
	 * For boolean, only == and != are applicable because relational operators like
	 * > or < don't apply to logical values.
	 * 
	 */

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(a < b); // true
		System.out.println(a > b); // false
		System.out.println(a == b); // false
		System.out.println(a != b); // true

	}
	/**
* List of Relational Operators:
Operator	Description		Example
==		Equal to			x == y (true if x equals y)
!=		Not equal to		x != y (true if x is not equal to y)
>		Greater than		x > y (true if x is greater than y)
<		Less than			x < y (true if x is less than y)
>=		Greater than or equal to	x >= y (true if x is greater than or equal to y)
<=		Less than or equal to	x <= y (true if x is less than or equal to y)
*/

}

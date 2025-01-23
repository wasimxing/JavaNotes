package operators;

public class LogicalOperator {

	/**
	 * logical operator 
	 * Logical AND (&&) - TRUE&&TRUE=TRUE, TRUE&&FALSE=FALSE, false &&false=false
	 * Logical OR (||) - true||true=true , true||false=true , false||false=false
	 * Logical NOT (!) -!true=false !false=true
	 * Logical XOR (^) - true^false=true.
	 * 
	 */
	
	static boolean logicalAND(boolean a,boolean b)
	{
		 return a&&b;

		
	}
	static boolean logicalOR(boolean a,boolean b)
	{
		 return a||b;

		
	}
	static boolean logicalNOT(boolean a)
	{
		 return !a;

		
	}
	static boolean logicalEXOR(boolean a,boolean b)
	{
		 return a^b;

		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("LogicalAND operator : "+logicalAND(true,false));
		System.out.println("LogicalOR operator : "+logicalOR(true,false));
		System.out.println("LogicalNOT operator : "+logicalNOT(true));
		System.out.println("LogicalEXOR operator : "+logicalEXOR(true,false));
		
	}
}

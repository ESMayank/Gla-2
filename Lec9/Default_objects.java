package Lec9;

class Customer {

	byte varByte;
	short varShort;
	int varInt;
	long varLong;
	float varFloat;
	double varDouble;
	char varChar;
	boolean varBoolean;

	String varString;

}

public class Default_objects {

	// TODO Auto-generated method stub

	public static void main(String[] args) {

		Customer c1 = new Customer();
		System.out.println("byte : " + c1.varByte);
		System.out.println("short : " + c1.varShort);
		System.out.println("int : " + c1.varInt);
		System.out.println("long : " + c1.varLong);
		System.out.println("float : " + c1.varFloat);
		System.out.println("double : " + c1.varDouble);
		System.out.println("char : " + c1.varChar);
		System.out.println("boolean : " + c1.varBoolean);
		System.out.println("String : " + c1.varString);
		// output
//				long : 0
//				float : 0.0
//				double : 0.0
//				char : '/u0000'
//				boolean : False
//				String : null
	}

}

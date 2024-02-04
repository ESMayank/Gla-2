package Lec4;

public class Type_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// There are 2 Types of Type Casting:
		// Implicit = small data type to Large Data Type in implicit compiler
		// automatically type cast the data type
		int i = 10;
		long l = i; // converting integer to long
		float f = l;// converting long to Float
		System.out.println("Before Conversion:" + i);
		System.out.println("After Conversion:" + l);
		System.out.println("After Conversion:" + f);
		// explicit = large data type to Small Data type by manually otherwise it shows
		// Error also called Narrowing Type Casting
		double d = 45.67;
		int I = (int) d;// converting double to Integer
		float F = (float) d;// converting double to Float
		System.out.println("Before Conversion:" + d);
		System.out.println("After Conversion:" + I);
		System.out.println("After Conversion:" + F);
	}

}

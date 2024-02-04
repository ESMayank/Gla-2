package Lec6;

public class Spring_Constant_Pool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello"; // String literal "Hello" is created in the constant pool

		String str2 = "Hello"; // Reuses the string from the constant pool

		String str3 = new String("Hello"); // Creates a new string object in the heap

		String str4 = "World"; // String literal "World" is created in the constant pool

		String str5 = new String("World"); // Creates a new string object in the heap

		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1 == str3: " + (str1 == str3));
		System.out.println("str1 == str4: " + (str1 == str4));
		System.out.println("str4 == str5: " + (str4 == str5));

		// Using intern() to explicitly add a string to the constant pool
		String str6 = str3.intern(); // Returns a reference to the string in the pool

		System.out.println("str1 == str6: " + (str1 == str6)); // Output: true
	}

}

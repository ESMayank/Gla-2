package Lec9;

public class Default_Value_Object {



	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		s1.age = 22;
		s1.name = "Abhishek";
		s1.cpi = 9.0f;

		s2.age = 21;
		s2.name = "Anil";
		s2.cpi = 8.0f;

		s3.age = 20;
		s3.name = "Rahul";
		s3.cpi = 7.0f;

		s4.age = 22;
		s4.name = "Rohit";
		s4.cpi = 8.7f;

		System.out.printf("%-20s%-20s%-20s \n", "NAME", "AGE", "CPI");
		System.out.printf("%-20s%-20s%-20s \n", s1.name, s1.age, s1.cpi);
		System.out.printf("%-20s%-20s%-20s \n", s2.name, s2.age, s2.cpi);
		System.out.printf("%-20s%-20s%-20s \n", s3.name, s3.age, s3.cpi);
		System.out.printf("%-20s%-20s%-20s \n", s4.name, s4.age, s4.cpi);

		// default value of instance variable in java

		 Student s5 = new Student();
		 System.out.printf("%-20s%-20s%-20s \n",s5.name,s5.age,s5.cpi);//returns default values 
		 //Default Values in Java
//		 short 0
//		 int 0
//		 long 0
//		 float 0.0
//		 double 0.0
//		 boolean false
//		 char '\u0000'
//		 String null
//		 
	}

}

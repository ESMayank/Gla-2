package Lec10;
class Student{
	static String Collegename;//giving uniqueness by static
	
}
public class Static_Variable {
	static float var_1 = 23.90f;
	double var_2 = 555.00;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student();
		//you can directly use static variable without making an object
        System.out.println(Student.Collegename);//if you change the static variable u have to make an object for that class
        Student s1 = new Student();
        s1.Collegename = "GLA";
        System.out.println(s1.Collegename);//overwrite the value of static variable
        System.out.println(Student.Collegename);
        s1.Collegename = "IIT Delhi";
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s2.Collegename);//iit delhi because of static variable store every object in a same address
        System.out.println(s3.Collegename);
        System.out.println(var_1);//23.90
//        System.out.println(var_2);//this will give error cause it is a non-static variable
	}

}

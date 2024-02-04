package Lec9;
class Student{//creating a class named student
	String name;
	int age;
	int id;
	float cpi;
}
public class Creating_Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s = new Student();//in this Student is Class s is reference variable new is a keyword and Student() is constructor
        s.name = "Mayank";//we define their name is Mayank
        s.id = 123;
        s.cpi = 8.0f;
        System.out.println(s.name);
        System.out.println(s.id);
        System.out.println(s.cpi);
	}

}

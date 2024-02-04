package Lec9;
 class Student1 {

	String name = "unknown";//set values instantly in Class so if we can't set value then this value treat as default
	int age = 0;
	float cpi = 0.0f;
	
}
public class instance_variable {
  public static void main(String[] args) {
			Student1 s1 = new Student1();
			System.out.println(s1.name);//unknown
			System.out.println(s1.age);//0
			System.out.println(s1.cpi);//0.0



	}}


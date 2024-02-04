package Lec9;
class Job {//creating a class named job
    String role;
    long salary;
    int id;
}
class Person {
	String name = "";
    Job varJob = new Job(); //defining a object in a different class
}
public class Creating_Object_in_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();//its define both person and job object
		p.name = "Abhi";//set value only in person
		p.varJob.id = 10;//targeting the job values
		p.varJob.role = "management";
		p.varJob.salary = 120000;
		System.out.println(p.varJob.id);//10
	}

}

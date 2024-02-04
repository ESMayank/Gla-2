package Lec11;

public class fun_demo {
void name() {//initiliaze a method in a class 
	System.out.println("Mayank");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun_demo f = new fun_demo();
        f.name();//calling a method in main class but method is non-static we have to take reference of class that's why we have make to
        //create a object
	}

}

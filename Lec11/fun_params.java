package Lec11;

public class fun_params {
static int num(int n) {//u can give parameter to a method and can be give many parameter but you have to specify what is their data type
	return n;
	
}
static void para(int n ,String s) {//u can give many as u wants parameter with any data type 
	System.out.println(n+" "+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(num(5));//you intialize value when you are calling the method
para(5,"Mayank");
	}

}

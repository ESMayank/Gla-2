package Lec7;
import java.util.Scanner;
public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc;
sc = new Scanner(System.in);
String name = sc.next();//only for taking one word input
System.out.println(name);
String full_name = sc.nextLine();//use for taking multi line
int i = sc.nextInt();//taking for integer input
double d = sc.nextDouble();//taking for double values;
sc.close();//for closing Scanner Class
	}

}

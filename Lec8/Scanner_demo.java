package Lec8;
import java.util.Scanner;//importing java--> module util--> package Scanner--> Class
public class Scanner_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);//creating a object where scanner is a class and sc is reference variable
int i = sc.nextInt();//for taking integer as a input;
System.out.println(i);
short s = sc.nextShort();//for taking short as a input;
System.out.println(s);
byte b = sc.nextByte();//for taking byte as a input;
System.out.println(b);
double d = sc.nextDouble();//for taking double as a input;
System.out.println(d);
String str = sc.next();//for taking String as a input;
System.out.println(str);
char c = sc.next().charAt(0);//for char there is not a specific one so we can use this
System.out.println(c);
	}

}

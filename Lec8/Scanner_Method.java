package Lec8;

import java.util.Scanner;

public class Scanner_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Mayank";
		Scanner sc = new Scanner(s);//read content of string variable s;
//		System.out.println(sc.next());//My
		
		String i = "123 May";
		Scanner in = new Scanner(i);
//		int a = in.nextInt();//store 123 because it is a integer
//		System.out.println(a);
		System.out.println(sc.hasNext());//return true when there is a value or false when there is empty value
		while(sc.hasNext()) {
			System.out.println(sc.next());//My name is Mayank is the output
		}
		System.out.println(in.hasNextInt());//return true if there any integer
		while(in.hasNextInt()) {
			System.out.print(in.next());
		}
		//delimeter
		String d = "123,Mayank,Singh";
		Scanner de = new Scanner(d);
//		System.out.println(de.next());//output is 123,Mayank,Singh but we want first 123 then Mayank and then Singh for that we use .delimeter
		System.out.println(de.delimiter());
		de.useDelimiter(",");//gives words after ,
		System.out.println(de.next());//123

}
}

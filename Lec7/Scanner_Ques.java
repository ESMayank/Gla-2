package Lec7;


import java.util.Scanner;

public class Scanner_Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1.
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a + b);
//		System.out.println("The average of sum is "+(double)((a+b)/2));
//		sc.close();
//		Q2.
//		String name = sc.next();
//		int age = sc.nextInt();
//		System.out.println("My name is "+name+" and my age is "+age);
//		Q3.
//		float f = sc.nextFloat();
//		System.out.println(Math.sqrt(f));
//		Q4.
//		String sen = sc.nextLine();
//		System.out.println(sen.split("\s+").length);
//		System.out.println(sen.length());
//		Q5.
//		float c = sc.nextFloat();
//		double f = (c*9/5)+32;
//		System.out.println(f);
//		Q6.
		String words = sc.nextLine();
		String s = "";
		for(int i = words.length()-1;i>=0;i--) {
			s+=words.charAt(i);
		}
		System.out.println(s);
//		Q7.
//		int num1 = sc.nextInt();
//		if(num1%2==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		sc.close();
	}

}

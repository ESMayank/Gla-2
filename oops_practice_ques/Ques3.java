package oops_practice_ques;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
System.out.println(isequal(s1,s2));
sc.close();

	}
public static boolean isequal(String s1,String s2) {
	if(s1==s2) {
		return true;
	}
	if(s1.length()!=s2.length()) {
		return false;
	}
	for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)!=s2.charAt(i)) {
			return false;
		}
	}
	return true;    
}
}

package oops_practice_ques;

public class Ques29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Nidhi will hate Swayam";
System.out.println(Smallest(str));

	}
public static String Smallest(String str) {
	String []arr = str.split("\s+");
	String ans = arr[0];
	int length = arr[0].length();
	for (int i = 1; i < arr.length; i++) {
		if(length>arr[i].length()) {
			length = arr[i].length();
			ans = arr[i];
		}
	}
	return ans;
}
}

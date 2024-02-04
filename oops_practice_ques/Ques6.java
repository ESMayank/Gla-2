package oops_practice_ques;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "mAyAnK";
System.out.println(toggle(str));
	}
public static String toggle(String str) {
	String ans = "";
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)>=65 && str.charAt(i)<=90 ) {
			ans+=(char)(str.charAt(i)+32);
		}
		else if(str.charAt(i)>=97 && str.charAt(i)<=122 ) {
			ans+=(char)(str.charAt(i)-32);
		}
	}
	return ans;
}
}

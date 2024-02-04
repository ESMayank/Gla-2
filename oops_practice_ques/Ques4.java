package oops_practice_ques;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "mayank";
System.out.println(palindrome(str));
	}
	public static boolean palindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}

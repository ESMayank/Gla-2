package oops_practice_ques;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello how are you";
		int vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			if(isvowel(str.charAt(i))) {
				vowel++;
			}
		}
		System.out.println(vowel);

	}
	public static boolean isvowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			return true;
		}
		return false;
	}
}

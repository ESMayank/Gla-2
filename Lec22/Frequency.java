package Lec22;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mayank";
		char c = 'a';
		System.out.println(freq(str,c));
				}
	public static int freq(String s,char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(c==s.charAt(i)) {
				count++;
			}
		}
		return count;
	}

}

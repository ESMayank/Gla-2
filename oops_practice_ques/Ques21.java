package oops_practice_ques;

public class Ques21 {
	public static void main(String[] args) {
		int N1 = 10;
		int n = 1;
		int N2 = 4;
		// for loop
		for (int i = 1; i <= N1;) {
			int num = 3 * n + 2;
			if (num % N2 != 0) {
				System.out.println(num);
				i++;
			}
			n++;
		}
		// While loop
		int i = 1;    
		while (i <= N1) {
			int num = 3 * n + 2;
			if (num % N2 != 0) {
				System.out.println(num);
				i++;

			}
			n++;
		}
	}
}

package oops_practice_ques;

public class Ques20 {
public static void main(String[] args) {
	//First Approach
	int n = 10;
	int sum = 0;
	while(n>0) {
		int rem = n%10;
		if(rem==0) {
			rem = 5;
		}
		sum = sum*10+rem;
		n = n/10;
	}
	System.out.println(reverse(sum));
	//Second Approach
	int mul = 1;
	while(n>0) {
		int rem = n%10;
		if(rem==0) {
			rem=5;
		}   
		sum = sum+rem*mul;
		mul *= 10; 
		n = n/10;
	}
	System.out.println(sum);
}
public static int reverse(int n) {
	int sum = 0;
	while(n>0) {
		int rem = n%10;
		sum = sum*10+rem;
		n = n/10;
	}
	return sum;
}
}

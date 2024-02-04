package oops_practice_ques;

public class Ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 121;
int p = n;
int digit = digit(n);
int sum = 0;
while(n>0) {
	int rem = n%10;
	sum+=Math.pow(rem, digit);
	n = n/10;
}
if(p==sum) {
	System.out.println("Armstrong");
}
else {
	System.out.println("Not");
}
	}
public static int digit(int n) {
	int count = 0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
}

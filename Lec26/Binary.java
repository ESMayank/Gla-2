package Lec26;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "10";
int num = Integer.parseInt(a);
System.out.println(octal(binary(num)));
	}
public static int binary(int num) {
	int sum = 0;
	int mul = 1;
	while(num>0) {
		int rem = num%10;
		sum+=mul*rem;
		mul*=2;
		num = num/10;
	}
	return sum;
}
public static int octal(int num) {
	int sum = 0;
	int mul = 1;
	while(num>0) {
		int rem = num%8;
		sum+=mul*rem;
		mul*=10;
		num = num/8;
	}
	return sum;
}
}

package Lec26;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 6;
int b = 4;
System.out.println((a*b)/gcd(a,b));
	}
public static int gcd(int divisor,int divident) {
	
	while(divisor%divident!=0) {
		int rem = divisor%divident;
		divisor = divident;
		divident = rem;
		
	}
return divident;
}
}

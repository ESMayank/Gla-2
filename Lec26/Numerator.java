package Lec26;

public class Numerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1 = 1;
int d1 = 8;
int n2 = 1;
int d2 = 8;
int c1 = (n1*d2)+(n2*d1);
int c2 = d1*d2;
System.out.println(c1/gcd(c1,c2)+"/"+c2/gcd(c1,c2));
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

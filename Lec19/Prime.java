package Lec19;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 1;
int m = 7;
for (int i = n; i <= m; i++) {
	if(isPrime(i)) {
		System.out.println(i);
	}
}
	}
public static boolean isPrime(int n) {
	int count = 0;
	for (int i = 2; i < n; i++) {
		if(n%i==0) {
			count++;
			return false;
		}
	}
	return true;
}
}

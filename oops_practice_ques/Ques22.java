package oops_practice_ques;

public class Ques22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k = 96;
int n = 10;
int w = 20;
int sum = 0;
for (int i = 1; i <= w; i++) {
	sum+=i*k;
}
if(sum>n) {
	System.out.println(sum-n);
}
else {
	System.out.println(0);
}
	}

}

package oops_practice_ques;
public class Ques18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min = 0;
int max = 120;
int step = 20;
for (int i = min; i <= max; i=i+step) {
	int c = (int)((5/9.0)*(i-32));
	System.out.println(i+" "+c);
}
	}         
}
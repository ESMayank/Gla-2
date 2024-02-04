package oops_practice_ques;

public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 2635;
int i = 0;
int odd = 0;
int even = 0;
while(num>0) {
	int rem = num%10;
	if(i%2!=0) {
		odd+=rem;
		i++;
	}
	else {
		even+=rem;
		i++;
	}
	num = num/10;
}
System.out.println(odd);
System.out.println(even);
	}

}

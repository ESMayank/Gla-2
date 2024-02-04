package oops_practice_ques;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char []carr = {'a','b','c','d','e'};
char target = 'c';
System.out.println(search(carr,target));
	}
public static int search(char []arr,char target) {
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==target) {
			return i;
		}
	}
	return -1;
}
}

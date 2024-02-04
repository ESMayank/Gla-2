package Lec16;

public class Min_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {7,1,2,3,4,5};
System.out.println(min(arr));
	}
public static int min(int []a) {
	int min = a[0];
	for (int i = 1; i < a.length; i++) {
		if(min>a[i]) {
			min = a[i];
		}
	}
	return min;
}
}

package Lec16;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {1,0,3,2,5};
sort(arr);
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
	}
public static void sort(int []a) {
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			}
		}
	}
}
}

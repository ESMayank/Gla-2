package Lec23;

public class Closest_to_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,20,30,-1,-2};
sum(arr);
	}
public static void sum(int []arr) {
	int ans = Integer.MAX_VALUE;
	int p1 = 0;
	int p2 = 0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			int sum = arr[i]+arr[j];
			if(Math.abs(ans)>Math.abs(sum)) {
				ans = sum;
				p1 = i;
				p2 = j;
			}
		}
	}
	System.out.println(p1+" "+p2);
}
}
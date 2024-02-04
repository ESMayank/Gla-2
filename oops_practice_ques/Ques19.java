package oops_practice_ques;

import java.util.Arrays;
import java.util.Scanner;

public class Ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
int []arr = new int[n];
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
}
Arrays.sort(arr);
int target = sc.nextInt();
int diff1 = 0;
int diff2 = 0;
int ans = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]+arr[j]==target) {
			int diff = arr[j]-arr[i];
			if(ans>diff) {
				ans = diff;
				diff1 = arr[i];
				diff2 = arr[j];
			}
		}
	}
}
System.out.println("Deepak should buy roses whose prices are "+diff1+" and "+diff2+".");
	}
	}
}

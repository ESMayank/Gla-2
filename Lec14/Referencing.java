package Lec14;

public class Referencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]a = new int[2][];
System.out.println(a[0]);//null cause a[0] is a behaving a object and object default value is null
 a[0] = new int[2];
System.out.println(a[0]);//[I@6d3af739 now a[0] class is defined as object
System.out.println(a[0][0]);//0 cause a[0][0] is integer value that why their default value is 0
	}

}

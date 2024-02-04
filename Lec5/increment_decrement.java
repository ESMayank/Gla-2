package Lec5;

public class increment_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = x++;
		System.out.println(x + ":" + y);
//		int z = ++4;// u cant use this with const
//		int z = (++x)++ it shows error because ++x give const
//		final int a = 11;
//		++a; you cant use this with final
		//This is works on all data type except boolean and string;
//		byte b = 10;
//		b = (byte) (b+1);//you have to type cast this for result
//		double d = 12L + 200 - 12.00f/0.5;//always return biggest data type
//		double d = 123/10;
//		System.out.println(d);
		float f = 9223372036854775807L;
		System.out.println(f);//it convert to exponential
		System.out.println(123/0.0);//its return infinity
//		System.out.println(0/0);//its gives error
		System.out.println(0/0.0);//its give NaN
	}

}

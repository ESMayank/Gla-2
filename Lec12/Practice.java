package Lec12;

class Staff {
	private String StaffName;
	int p;
	static int count;
//	int count;
	Staff(){
//		System.out.println("Default constructor is running");
//		StaffName = "mayank";
		count++;
		p++;
	}
	
//	Staff(String name){
//		StaffName = name;
//		count++;
//	}

	
	public String getStaffName() {
		return StaffName;
	}

	public void setStaffName(String staffName) {
		this.StaffName = staffName;
	}
	
//	Staff(String name) {
//		System.out.println("String param");
//	}
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
//		new Staff();// Default constructor is running
		Staff s1;// nothing print but not showing error
//Staff s2 = new Staff();
//		Staff s3 = new Staff("Anil");// String params because it target another constructor
//Staff s4 = new Staff();//showing error cause we have to give param in this otherwise it will not run if we do not make any constructor in 
//class then jvm make it by itself;
//        Staff s5 = new Staff("Rohit");
//        s5.setStaffName("Mayank");
//        System.out.println(s5.getStaffName());
		
        Staff s6 = new Staff();
        Staff s7 = new Staff();
        System.out.println(s7.p+" " +s6.count);//cause firstly 2 times constructor running so it can convert count = 2 only if var is static
        System.out.println(s7.p+ " "+s7.count);
        
        
	}
	
}

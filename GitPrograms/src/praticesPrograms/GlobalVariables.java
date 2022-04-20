package praticesPrograms;

public class GlobalVariables {
    //global variables
	static  String name="vamshi";
    static int id =1234;
	static String dept="DEVELOPER";
	
	
	public static void displayDetails() {
		System.out.println("customer name:" + name);
		System.out.println("customer id:" + id);
		System.out.println("customer dept:" + dept);
	}
	public static void main(String[] args) {
		
		displayDetails();
		
	}

}

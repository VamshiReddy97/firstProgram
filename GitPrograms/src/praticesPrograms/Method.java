// Methods Static and non Static methods Calling in main;
//Methods without Aruguments;
//Method with return type;
package praticesPrograms;

public class Method {
	public static void book() {
		System.out.println("Author:vamshi");
		System.out.println("Book Name: Bio of Struggles");
		System.out.println("Book Prince:150");
	}
	

	public static void run() {
       int A=25;
       System.out.println(A);
	}
	public void walk() {
		String B="Vamshi walking 5km per day";
		System.out.println(B);
	}

	public static void main(String[] args) {
      run();
      book();
      Method M=new Method();
      M.walk();
      
	}

}
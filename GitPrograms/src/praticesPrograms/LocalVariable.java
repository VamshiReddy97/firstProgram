//local variable call the liocal varibles directely and in thestatic method can 
//call the static method directly in main by using method signature syntax:method name();
package praticesPrograms;

public class LocalVariable {

	public static void display() {
		String Name = "vamshi";
		int Salary = 30000;
		int Id = 123;
		System.out.println(" --------New---------");
		System.out.println("Employe Name:" + Name);
		System.out.println("Employe Salary:" + Salary);
		System.out.println("Employe Id:" + Id);

	}

	public static void main(String[] args) {
		String name = "umesh";
		int id = 432;
		String branch = "informatio technlogy";
		System.out.println(" --------New---------");
		System.out.println("Friend name:" + name);
		System.out.println("Friend id:" + id);
		System.out.println("Brancj:" + branch);

		display();
	}
}

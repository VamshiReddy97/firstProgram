
package praticesPrograms;

public class MethodWithArguments {

	public static void student(String Name, int Id, int PhoneNumber) {

		System.out.println("Name:" + Name);
		System.out.println("Id:" + Id);
		System.out.println("PhoneNumber:" + PhoneNumber);

	}

//Static method with Aruguments
	public void Teacher(String EmpName, int EmpSalary, int DeptNo, String DeptName) {

		System.out.println("EmpName:" + EmpName);
		System.out.println("EmpSalary:" + EmpSalary);
		System.out.println("Deptno:" + DeptNo);
		System.out.println("String DeptName:" + DeptName);

	}

	// non Static method without Aruguments
	public static void main(String[] args) {

		student("umesh", 12345, 955356454);
		System.out.println("------Employe Details----------");
		MethodWithArguments M = new MethodWithArguments();
		M.Teacher("vamshi", 30000, 123, "devloper");

	}

}

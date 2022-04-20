package praticesPrograms;

public class Constructor {
	String Name;
	String Address;
	int id;
	int salary;
	

	public Constructor() {
		Name = "vamshi";
		Address="kesamdram";
		id=123;
		salary=30000;
	}

	public static void main(String[] args) {
        Constructor C=new Constructor();
        
		System.out.println(C.Name);
		System.out.println(C.Address);
		System.out.println(C.id);
		System.out.println(C.salary);
		
		
	}
}

package praticesPrograms;

public class ConstructorAruguments {
	int id;
	String name;

	// creating a parameterized constructor
	ConstructorAruguments(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		ConstructorAruguments s1 = new ConstructorAruguments(111, "Vamshi");
		ConstructorAruguments s2 = new ConstructorAruguments(222, "Umesh");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}

	

}

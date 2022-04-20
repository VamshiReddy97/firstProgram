package praticesPrograms;

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Employe extends Person {

	int salary;

	public Employe(String name, int id, int salary) {
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);

	}

	void dispalying() {
		System.out.println(id + " " + name + " " + salary);

	}

}

public class SuperKeyword {
	public static void main(String[] args) {

		Employe e1 = new Employe("vamshi", 456, 40000);
		Employe e2 = new Employe("umesh", 456, 30000);
		Employe e3 = new Employe("sahithi", 456, 20000);
		e1.display();
		e2.dispalying();
		e3.display();

	}

}

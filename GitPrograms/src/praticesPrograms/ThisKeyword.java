package praticesPrograms;

class Student {
	String name;
	int rollno;
	float fee;
	/**
	 * @param name
	 * @param rollno
	 * @param fee
	 */
	public Student(String name, int rollno, float fee) {
		this.name = name;
		this.rollno = rollno;
		this.fee = fee;
	}
	void display() {
		System.out.println(name+" "+rollno+" "+fee);
	}
}



public class ThisKeyword {

	public static void main(String[] args) {
		
		Student s1=new Student("vamshi", 123, 4000);
		s1.display();

	}

}

package praticesPrograms;

class Animals{
	 
	void eat() {
		System.out.println("Animal is eating");
		
	}
}
class Dogs extends Animals{
	void barking() {
		System.out.println("it is barking ");
	}
}

class cat extends Animals{
	void slepping() {
		System.out.println("cat is sleeping");
	}
}


public class HierarchicalInhertaince {

	public static void main(String[] args) {
		cat c1=new cat();
		c1.slepping();
		c1.eat();
		//c1.braking(// In hierachicall inhertanice we can extends two sub class at time it is
		//ambuguinty problem to to hirechacall with the interface can be possiable;
	

	}

}

// method overriding  : During the inhertiance  sub class has 
//complete preveliage to change the method implmentation super class  

package praticesPrograms;

class Parent {
	public void car() {
		System.out.println(" Black color");
	}

	public void carName() {
		System.out.println(" Roll Rocyal");
	}
}

class Son extends Parent {
	public void car() {
		System.out.println(" Blue color");
	}

	public void carName() {
		System.out.println(" fortuner");
	}
}

class Daugther extends Parent {
	public void car() {
		System.out.println(" Brown color");
	}

	public void carName() {
		System.out.println(" verna");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.car();
		p1.carName();
		Son s1 = new Son();
		s1.car();
		s1.carName();
		Daugther d1 = new Daugther();
		d1.car();
		d1.carName();
	}
}

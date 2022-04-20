package praticesPrograms;

public class ConstructorOverloading {
	String name, color, model;
	double price;
	int capacity;

	public ConstructorOverloading(String name, String color) {
		this.name = name;
		this.color = color;

	}

	public ConstructorOverloading(String name, String color, String model) {
		this.name = name;
		this.color = color;
		this.model = model;

	}

	public ConstructorOverloading(String name, String color, String model, double price, int capacity) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.price = price;
		this.capacity = capacity;

	}

	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading("jeep", "black");
		System.out.println("car:" + co.name + " color :" + co.color);
		ConstructorOverloading c1 = new ConstructorOverloading("jeep", "black", "verna");
		System.out.println("car:" + co.name + " color :" + co.color + " model: " + c1.model);
		ConstructorOverloading c2 = new ConstructorOverloading("jeep", "black", "verna", 500000, 500);
		System.out
				.println("car:" + co.name + " color :" + co.color + " model: " + c1.model + " capacity: " + c2.capacity);

	}

}

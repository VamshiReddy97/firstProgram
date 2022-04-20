package praticesPrograms;

public class MethodOverloading {

	public static void add() {
		System.out.println(10+20);
	}
	public static void add(int i,int j) {
		System.out.println(i+j);
	}
	public static void add(String n,int i,double j) {
		System.out.println(n+i+j);
	}
	
	public static void main(String[] args) {
	
    add();
    add(100,200);
    add("vamshi",100,2.2);
	}

}

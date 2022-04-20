package praticesPrograms;

abstract class Vechicles{
	abstract public void price();
	abstract public void noOfWheeles();
}
abstract class RoyalEnfiled extends Vechicles{
	@Override
	public void price() {
		System.out.println(" 2,30000 lakhs");
	}
	@Override
	public void noOfWheeles() {
		System.out.println(" Two wheeles are present");
	}
}


public class Abstract {
	public static void main(String[] args) {
         
		 RoyalEnfiled r1=new RoyalEnfiled();
		r1.price();
		r1.noOfWheeles();
	}
}

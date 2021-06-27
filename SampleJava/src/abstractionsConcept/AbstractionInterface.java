package abstractionsConcept;

interface Car1{
	
	public void Brand();
	public void CarType();
}

class Details implements Car1{
	
	public void Brand() {
		String brandname="BMW";
		System.out.println("Brand Name:  "+brandname);
	}
	
	public void CarType() {
		String Type="Most Expensive Car";
		System.out.println("CarType: "+Type);
	}
}



public class AbstractionInterface {

	public static void main(String[] args) {
		Details obj = new Details();
		obj.Brand();
		obj.CarType();
	}
}

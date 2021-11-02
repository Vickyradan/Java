package abstractionsConcept;



abstract class Vehicle{
	
	String Brand ="Ford";
	int Wheels =4;
	
	public abstract void Details();
	
}

class Car extends Vehicle{
	 String Type ="Sports Car";
	public void Details() {
		
	}
}

public class Abstaction {
	
	public static void main(String[] args){
	Car obj = new Car();
	
	System.out.println("Brand Name: "+obj.Brand);
	System.out.println("How Many Wheels: "+ obj.Wheels);
	System.out.println("Car Type: "+obj.Type);
		System.out.println("Car "+obj.Type);
	
	}

}

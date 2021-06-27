package Inheridennce;

class Vehicle 
{
	String brand = "Ford"; // Vehicle attribute
	public void honk() 
	{                   
		// Vehicle method
		System.out.println("Tuut, tuut!");		         
	}
}

public class Model extends Vehicle {

	String modelName = "EcoSport";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model myCar = new Model();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);

	}


}

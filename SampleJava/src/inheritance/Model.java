package inheritance;

   class Vehicle{
	 
 	 String BrandName = "Ford";
 	 
 	 public void Car(){
 		 System.out.println("This is one of the best Car: "+BrandName);
 	 }
	 
    }


public class Model extends Vehicle {

	String ModelName ="EcoSport";
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model obj = new Model();
		obj.Car();

	}

}

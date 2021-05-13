package inheritance;


//use private and protected access modifier

public class Car3 {
	
	private int wheels =4;
	
	   @SuppressWarnings("unused")
	private void Engine(){
		
		System.out.println("how many wheels in car: "+wheels);
	}
	   
	   public static void main(String[] args) {
			// TODO Auto-generated method stub
			Bmw bmw = new Bmw();
			bmw.Engine();
			System.out.println(bmw.wheels);
		
		}

}

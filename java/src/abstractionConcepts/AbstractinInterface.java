package abstractionConcepts;

//Interface
interface Details{
	
	public void Name();  // interface method (does not have a body)
	public void age();   // interface method (does not have a body)
	 
}


//Bioinformatoin "implements" the Details interface
class Bioinformatoin implements Details{
	
	public void Name(){
		// The body of Name() is provided here
		String name ="Vicky";
		System.out.println(name);
	}
	
	public void age(){
		
		// The body of age() is provided here
		int age = 24;
		System.out.println(age);
	}
}

public class AbstractinInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bioinformatoin Obj = new Bioinformatoin();
		Obj.age();
		Obj.Name();

	}

}

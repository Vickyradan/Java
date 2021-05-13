package constructor;


//Create a Main class
public class MainClass {
	
	
	int BrithYear;  // Create a class attribute
	String Name;    // Create a class attribute

	// Create a class constructor for the Main class
	public MainClass(int fDOB, String fName){
		
	BrithYear = fDOB;   // Set the initial value for the class attribute
	Name = fName;       // Set the initial value for the class attribute
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass Obj = new MainClass((1996), "Vicky");     // Create an object of class Main (This will call the constructor)
		System.out.println(Obj.Name+": "+Obj.BrithYear);
		

	}

}

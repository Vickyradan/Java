package abstractionConcepts;


public abstract class Abstraction1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();

	}

}

abstract class Animal 
{
	// Abstract method (does not have a body)
	public abstract void animalSound();
	// Regular method
	public void sleep() 
	{
		System.out.println("sleep Zzz");
	}
}

// Subclass (inherit from Animal)
class Pig extends Animal 
{
	public void animalSound() 
	{
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

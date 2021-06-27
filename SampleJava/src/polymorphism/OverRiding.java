package polymorphism;


class Bike{

	public void run(){
		System.out.println("Vehicle is running");
	}
}


public class OverRiding extends Bike {
	
	public void run(){
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRiding obj = new OverRiding();
		obj.run();

	}

}

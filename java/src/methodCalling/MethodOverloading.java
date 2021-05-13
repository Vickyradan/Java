package methodCalling;

public class MethodOverloading {
	// Different way same method
	
	static int Method(int X, int Y){
		return X+Y;
	}
	static double Method(double X, double Y){
		return X+Y;
	}
	static float Method1(float X, float Y){
		return X+Y;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number1 = Method (12,15);
		double number2=Method(12.51,15.62);
		float number3= (float) Method(78.1,98.3);
		System.out.println("int:"+Number1);
		System.out.println("doble: "+number2);
		System.out.println("float: "+number3);
		
		// This method scope
		int X = 10;
		int Y =20;
		
		System.out.println(X+Y);
		
		int Z=X+Y;
		System.out.println(Z);
		

	}

}

package methodCalling;

public class MethodInt {
	
	static void MyMethod(String fname, int fage){
		
		System.out.println(fname +" Age: "+fage);
	}
	
	static void Method(int number){
		
		System.out.println("Mobile:"+"  "+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMethod("Vicky", 25);
		Method(234569874);

	}

}

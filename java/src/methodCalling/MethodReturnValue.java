package methodCalling;

public class MethodReturnValue {
	
	static int MyMethod(int fna){
		return 8+fna;
	}
	
	static String Method(String x){
		
		return x;	
	}
	
	static int Method1(int X, int Y){
		return X+Y;
	}
	
	static int Method2(int A, int B){
		return A+B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyMethod(5));
		System.out.println(Method("Vicky"));
		System.out.println(Method1(123,546));
		
		int Z = Method2(456, 789);
		System.out.println(Z);
		

	}

}

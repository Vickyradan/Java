package javaSample;

public class ReturnValue {
	
	
	public int add(int x){
		 return 12+x;
		
	}
	
	public int add(int x, int y){
		
		return x+y;
		
	}
	
	static double add( double x, double y){
		
		 return x+y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnValue obj =new ReturnValue();
		System.out.println("Add value:  "+obj.add(15));
		System.out.println("Add xy Value:  "+ obj.add(36, 65));
		
		System.out.println("Add Doubles Value: "+ add(12.55, 16.65));

	}

}

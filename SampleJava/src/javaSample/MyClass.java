package javaSample;

public class MyClass {
	
	
	public void add(){
		int x= 12;
		int y= 15;
		
		int z= x+y;
		System.out.println("add Value:"+ z);
		
	}
	
	static void Subtraction(){
		
		int x=156;
		int y = 1156;
		
		int z=y-x;
		System.out.println("Subtract value"+z);
		
	}
	
	public static void main (String[] args){
		MyClass obj = new MyClass();
		
		obj.add();
		
		Subtraction();
		
	}

}

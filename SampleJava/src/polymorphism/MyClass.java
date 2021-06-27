package polymorphism;

public class MyClass {
	
	
	public int add(int x, int y){
		return x+y;
		
	}
	
	public int add(int x, int y, int z){
		
		return x+y+z;
	}
	
	public double add (double x, double y){
		
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj = new MyClass();
		
		System.out.println(obj.add(123,345));
		System.out.println(obj.add(23, 45, 67));
		System.out.println(obj.add(34.45, 67.12));

	}

}

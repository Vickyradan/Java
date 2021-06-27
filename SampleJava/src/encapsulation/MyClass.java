package encapsulation;

public class MyClass {
	
	 private String StudentName;
	
	public void Setname(String Fname){
		
		StudentName=Fname;
	}
	
	public String Getname(){
		
		return StudentName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass obj = new MyClass();
		obj.Setname("Arul");
			
		System.out.println(obj.Getname());
		
	}

}

package constructor;

public class BothConstructor {
	
	String StudentName;
	int Age;
	
	BothConstructor() {
		// TODO Auto-generated constructor stub
		
		StudentName="Arun";
		Age=34;
	}
	
	public BothConstructor(String fname, int fage){
		
		StudentName=fname;
		Age=fage;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BothConstructor obj1= new BothConstructor();
		System.out.println("student name:  "+ obj1.StudentName);
		System.out.println("Student Age:  "+ obj1.Age);
		
		BothConstructor obj2 = new BothConstructor("Agin", 23);
		System.out.println("student name: "+obj2.StudentName);
		System.out.println("Student Age:  "+ obj2.Age);
		

	}

}

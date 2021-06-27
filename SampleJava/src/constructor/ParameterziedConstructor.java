package constructor;

public class ParameterziedConstructor {
	
	String StudentName;
	int RollNo;
	
	public ParameterziedConstructor(String name, int No) {
		// TODO Auto-generated constructor stub
		StudentName=name;
		RollNo=No;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterziedConstructor obj =new ParameterziedConstructor("Bala", 7765);
		System.out.println(obj.StudentName);
		System.out.println(obj.RollNo);

	}

}

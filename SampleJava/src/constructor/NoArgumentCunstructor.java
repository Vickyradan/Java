package constructor;

public class NoArgumentCunstructor {
	
	String name;
	int ID;
	
	NoArgumentCunstructor() {
		// TODO Auto-generated constructor stub
		
		name="Raja";
		ID =1234;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgumentCunstructor obj = new NoArgumentCunstructor();
		
		System.out.println(obj.name);
		System.out.println(obj.ID);

	}

}

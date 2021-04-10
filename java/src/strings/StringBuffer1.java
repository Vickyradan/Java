package strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String object = "Sample name";
	
		// (chartAt(1)) Letter Index positions   
		System.out.println("1."+" "+object.charAt(0));
		
		// (.concat) Adding two different strings   // Using (\n) add next line      // Using concatenate (+" ") space between two strings
		System.out.println("2."+" "+object+"\n".concat("Example"));
		
		System.out.println("3."+" "+object);
		
		System.out.println("----------------");
		
		
		StringBuffer Anotherobject = new StringBuffer("Sample name");
		
		System.out.println("1."+" "+Anotherobject.append(" Example"));
		
//		System.out.println("2."+" "+Anotherobject.reverse());
//		
//		System.out.println("2."+" "+Anotherobject.reverse());
		
		System.out.println("2."+Anotherobject.capacity());
		
		System.out.println("3."+Anotherobject.length());
		
		System.out.println("4."+Anotherobject.delete(0, 6));
		
		System.out.println("5."+Anotherobject.deleteCharAt(5));
		
		System.out.println("6."+Anotherobject.insert(6, " "));
		
		
		
		
		

	}

}

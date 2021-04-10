package strings;

public class StringBilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String object = "Sample name";
		
		// (chartAt(1)) Letter Index positions   
		System.out.println("1."+" "+object.charAt(0));
		
		// (.concat) Adding two different strings   // Using (\n) add next line      // Using concatenate (+" ") space between two strings
		System.out.println("2."+" "+object+"\n".concat("Example"));
		
		System.out.println("3."+" "+object);
		
		System.out.println("----------------");
		
		
		StringBuilder anotherobject = new StringBuilder("Example");
		
		System.out.println("1."+anotherobject.append(" name"));
		
		System.out.println("2."+anotherobject.capacity());

		System.out.println("3."+anotherobject.length());

		System.out.println("4."+anotherobject.delete(0, 6));

		System.out.println("5."+anotherobject.deleteCharAt(5));

//		System.out.println("6."+anotherobject.insert(6, "sample"));

	}

}

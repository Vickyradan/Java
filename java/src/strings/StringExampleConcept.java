package strings;

public class StringExampleConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String object = "Sample name";
		String anotherString = "  Example";
		
		// (chartAt(1)) Letter Index positions   
		System.out.println("1."+" "+object.charAt(0));
		
		// (.concat) Adding two different strings   // Using (\n) add next line      // Using concatenate (+" ") space between two strings
		System.out.println("2."+" "+object+"\n".concat(anotherString));
		
		// (contains("")) check whether the specific set of characters are part of the given string or not
		System.out.println("3."+" "+object.contains("e"));
		
		//   it contains the exact same sequence of characters in the specified string
		System.out.println("4."+" "+object.contentEquals("Sample name"));
		
		//  Check end of string letter or Character
		System.out.println("5."+" "+object.endsWith("m"));
		
		//   it contains the exact same sequence of characters in the specified string
		System.out.println("6."+" "+object.equals("Sample name"));
		
		//  it contains the exact same sequence of characters in the specified string without any (Upper or Lower case)
		System.out.println("7."+" "+object.equalsIgnoreCase("sample name"));
		
		// Find letter index positions
		System.out.println("8."+" "+object.indexOf("e"));
		
		// same multiple letter involve to find next word
		System.out.println("9."+" "+object.indexOf("e", 6));
		
		//  Find letter last index positions
		System.out.println("10."+" "+object.lastIndexOf("e"));
		
		// Find string length (letters count)
		System.out.println("11."+" "+object.length());
		
		// Replace to one letter to another letter
		System.out.println("12."+" "+object.replace("m", "M"));
		
		// First letter Replace to one letter to another letter
		System.out.println("13."+" "+object.replaceFirst("e", "E"));
		
		// Continuous sequence of characters within a string
		System.out.println("14."+" "+object.substring(3));
		
		// Difference between sequence of characters within a string
		System.out.println("15."+" "+object.substring(3, 7));
		
		//
		System.out.println("15."+" "+object.toLowerCase());
		
		System.out.println("16."+" "+object.toUpperCase());
		
		// To trim (front and back unwanted space)
		System.out.println("17."+" "+anotherString.trim());
		
		//
		System.out.println("18."+" "+String.join("/", "28","08","2021"));
		
		System.out.println("19."+" "+object.matches("Sample name"));
		
		System.out.println("20."+" "+object.startsWith("S"));
		
		System.out.println("21."+" "+object.startsWith("a",1));
		
		System.out.println("22."+" "+object.subSequence(0, 10));
		
		System.out.println("23."+" "+object.startsWith("S"));
		
		
		
		
	}

}

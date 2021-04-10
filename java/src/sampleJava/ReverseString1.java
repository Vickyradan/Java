package sampleJava;

public class ReverseString1 {
	


	//method which reverses the string
	private static String reverse(String str) {

		//terminating condition
		if(str == null || str.length() <= 1) {
			return str;
		}

		//calling the recursive function
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "testing";

		//using the reverse method of string
		String rev = reverse(str);

		System.out.println(rev);

	}

}

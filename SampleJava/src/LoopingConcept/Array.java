package LoopingConcept;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String[] StudentName = {"Raja","Arun","Bala", "Saran"};
		
//		for (int i = 0; i < StudentName.length; i++) {
//			System.out.println(StudentName[i]);
//		}
//		
		
		int[] Number = {1,2,3,4,5,6,7,8,9,10}; 
		
//		for (int i = 0; i < Number.length; i++) {
//			
//			if (i==6) {
//				break;
//			}
//			
//			System.out.println(Number[i]);
//		}
		
		
		
		int i=0;
		while (i<Number.length) {
			
			System.out.println(Number[i]);
			i++;
			
			if (i==6) {
				break;
			}
			
		}

	}

}

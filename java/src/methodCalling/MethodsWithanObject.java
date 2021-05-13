package methodCalling;

public class MethodsWithanObject {

		public void fullThrottel(String fname){
			System.out.println("The car is going as fast as it can!:"+fname);
		}
		public void Speed(int maxSpeed){
			System.out.println("Max speed is: " + maxSpeed);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MethodsWithanObject Obj = new MethodsWithanObject();
			Obj.fullThrottel("full speed");
			Obj.Speed(200);

	}
}

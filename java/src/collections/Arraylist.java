package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
	
	// Another Calling method
	public void ArrayList(){
		
		List<String>  List = new ArrayList<String>();

		List.add("Cat");
		List.add("Mouse");
		List.add("Dog");
		List.addAll(0, List);

		System.out.println("Animal Name:"+List);

		System.out.println(List.get(2));
		System.out.println("Animal Name:"+List.size());
		System.out.println("Animal Name:"+List.contains("Cat"));
		System.out.println("Animal Name:"+List.set(3, "Fox"));
		System.out.println("Animal Name:"+List);
		System.out.println("Animal Name:"+List.remove("Mouse"));
		System.out.println("Animal Name:"+List);
		System.out.println("Animal Name:"+List.remove(4));
		System.out.println("Animal Name:"+List);
		System.out.println("Animal Name:"+List.add("Cat"));
		System.out.println("Animal Name:"+List);
		
		for(int i=0;i<List.size();i++){
			System.out.println(List.get(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arraylist Array = new Arraylist();
		Array.ArrayList();
		
		/*List<String>  List = new ArrayList<String>();
		
		List.add("Cat");
		List.add("Mouse");
		List.add("Dog");
		List.addAll(0, List);
		
		System.out.println("Animal Name:"+List);
		
		System.out.println(List.get(2));
		System.out.println("Animal Name:"+List.size());
		System.out.println("Animal Name:"+List.contains("Cat"));
		System.out.println("Animal Name:"+List.set(3, "Fox"));
		System.out.println("Animal Name:"+List);
		System.out.println("Animal Name:"+List.remove("Mouse"));
		System.out.println("Animal Name:"+List);
		System.out.println("Animal Name:"+List.remove(4));
		System.out.println("Animal Name:"+List);
		System.out.println("Animal Name:"+List.add("Cat"));
		System.out.println("Animal Name:"+List);*/
	}

}

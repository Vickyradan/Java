package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
		System.out.println("-------------------------------");
		for (String string : List) {
			System.out.println(string);
		}

		//Using List iterator

		System.out.println("-------------------------------");
		ListIterator<String> iterator = List.listIterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("next"+string);
		}

		System.out.println("-------------------------------");

		while (iterator.hasPrevious()) {
			
			System.out.println("previous"+iterator.previous());

		}
		
		System.out.println("-------------------------------");
		
		// Iterator only forward  direction
		Iterator<String> iterator2 =  List.iterator();
		
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);
			
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

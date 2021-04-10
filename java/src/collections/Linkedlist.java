package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> List = new LinkedList<String>();
		
		List.add("Cat");
		List.add("Mouse");
		List.add("Dog");
		
		System.out.println(List);
		System.out.println(List.subList(0, 2));
		System.out.println(List.poll());
		System.out.println(List);
		System.out.println(List.removeFirstOccurrence("Mouse"));
		System.out.println(List);
		System.out.println(List.set(0, "Mouse"));
		System.out.println(List);
		System.out.println(List.pop());
		System.out.println(List);
		
		
		

	}

}

import java.util.HashSet;
import java.util.Set;

public class setInterfaceDemo {
	public static void main(String[] args) {
		Set<String> names =  new HashSet<String>();
		names.add("Mayank");
		names.add("Chandra");
		names.add("Bhatt");
		names.add("Ayush");
		names.add("Mayank");
		names.add("Ayush");
		/* As set does not allow duplicate entry of element it should remove last entry which is duplicate i.e. Mayank*/
		System.out.println("Elements inside List is :- "+names);
		
		/* Creating list 1 with elements*/
		Set<Integer> list1 = new HashSet<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(4);
		list1.add(8);
		list1.add(9);
		list1.add(0);
		System.out.println("Elements in first List :- "+ list1);
		
		/* Creating list 2 with elements*/
		Set<Integer> list2 = new HashSet<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(7);
		list2.add(5);
		list2.add(4);
		list2.add(0);
		list2.add(7);
		list2.add(5);
		System.out.println("Elements in first List :- "+ list2);

		/* Performing Union between both the list*/
		list1.addAll(list2);
		System.out.println("Union of both the List :- "+list1);
		
		/* Performing Intersection between both the list*/
		list1.retainAll(list1);
		System.out.println("Intersection of Both the List :- "+list1);
		
		/* Performing Difference between both the list*/
		list1.removeAll(list2);
		System.out.println("Difference between both list :- "+list1);
	}
}

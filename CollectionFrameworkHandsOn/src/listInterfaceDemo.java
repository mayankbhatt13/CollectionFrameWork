import java.util.ArrayList;
import java.util.List;

public class listInterfaceDemo {
	public static void main(String[] args) {
		/* Creating ArrayList using List */
		List<Integer> list1 =  new ArrayList<Integer>();
		list1.add(0,3); //Inserting values in the list based on indexes.
		list1.add(1,6);
		list1.add(2,8);
		/* We can also add values without any index, this element will be added automatically after the existing element */
		list1.add(13);
		System.out.println(list1);
		
		/* Creating new List*/
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(13);
		list2.add(31);
		
		/*We can also add one list inside other. We can give the index from where to add the elements of list2 in list 1
		Or we can simple add the elements of second list after list1 elements.*/
		list1.addAll(list2);
		System.out.println(list1);
		
		/* We can also remove element from list by passing the index value*/
		System.out.println("List before removal"+list1);
		list1.remove(2);//I have removed the 3rd element i.e. element at index 2 as index starts from 0.
		System.out.println("List after removal"+list1);
		
		/*Since List preserves the insertion order it also allows positional access of elements.*/
		System.out.println("Element in list1 at index 3 is :- "+list1.get(3));
		
		/* We can also perform replace operation on list element based on index*/
		list1.set(2, 49);
		System.out.println("Updated elements in list1 :- "+list1);
		
		List<String> name = new ArrayList<String>(10);
		name.add("Mayank"); //0th index
		name.add("Chandra"); //1st index
		name.add("Mayank"); //2nd index
		name.add("Bhatt"); //3rd index
		
		/*We can also perform search operation of list. It will return index of element if element present in list*/
		System.out.println("First index of Mayank :- "+name.indexOf("Mayank"));
		System.out.println("Last index of Mayank :- "+name.lastIndexOf("Mayank"));
		
		/* What if element searched is not present in list, it will return -1*/
		System.out.println("Index of Hello :- "+name.indexOf("Hello"));
		
		/* We can select elements from the list based on some range. Here from index is included and to is excluded.*/
		System.out.println("Elements in list between range 1 to 3 :- " +name.subList(1, 3));
	}
}

package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionDay2Linkedlistexample {
	public static void main(String[]args)
	{
		//List and its classes
//		LinkedList a = new LinkedList();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add('A');
//		a.add(85.25);
//		a.add("Abhishek");
//		System.out.println(a);
//		
//		a.remove(5);
//		System.out.println(a);
//		a.set(4, "Abhi");
//		System.out.println(a);
//		System.out.println("ele of size is--"+a.size());
//		System.out.println(a.get(2));
		
		
		//SPecific syntax
//		LinkedList<Integer> b =new LinkedList<Integer>();
//		b.add(10);
//	//	b.add('A');//Not possible
//		b.add(20);
//		b.add(30);
//		b.add(50);
//		System.out.println(b);
//		b.remove(2);
//		System.out.println(b);
//		b.set(1, 20);
//		System.out.println(b);
//		System.out.println("ele of size is--"+b.size());
//		System.out.println(b.get(2));
		
	//	List
//		upcasting concept
		
		//generalized syntax
		List z = new ArrayList();
		z.add(10);
		z.add(20);
		z.add(30);
		z.add(40);
		z.add("Abhi");
		z.add(14.77);
		System.out.println(z);
		
		//All method are accepted
		//add
		//set
		//remove
		//size
		//get
		
		
		//We have to genralized the particular syntax be accepted
		
		List<Double> x = new LinkedList<Double>();
		//All Method are accepted
		
		
		//List vector be accepted
		List c= new Vector();
		List<String> d= new Vector<String>();
		
		

		
		
	}

}

package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;







public class Coolectionday2hashsetexample {
	public static void main(String[]args)
	{
		HashSet x = new HashSet();
		x.add(100);
		x.add(200);
		x.add(300);
		x.add("Vaibhav");
		x.add('A');
		System.out.println(x);
		System.out.println("ele of size is-"+x.size());
	//this method are not possible	
		//set
		//get
		//remove
		
		//single single element print
		
//		iterator interface
		                 //method of HashSet
		
		      Iterator z =x.iterator();
		
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
		 //System.out.println(z.next());
//		 System.out.println(z.next());
		
		//System.out.println("size->"+x.size());       
	//	
		for(int i=1; i<=x.size(); i++)
		{
			System.out.println(z.next());
		}
		
		 //generalize syntax
		 Set m = new HashSet();
		 
		 //specific syntax 
		 Set<Integer> n = new HashSet<Integer>();
		 
		 Set<Integer> k = new LinkedHashSet<Integer>();
		 
		 //add
		 //size
		 //iterator -> Iterator -> next


	}

}

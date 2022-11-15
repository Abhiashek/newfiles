package collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListandSetdiffercemethod {
	public static void main(String[]args)
	{
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);
		a.add(30);
		a.add(null);
		a.add(null);
//		System.out.println(a);
		
		Set<Integer> b = new HashSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(30);
		b.add(30);
		b.add(null);
		b.add(null);
		System.out.println(b);
	}

}

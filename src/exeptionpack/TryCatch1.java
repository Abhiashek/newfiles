package exeptionpack;

public class TryCatch1 {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		try {
			System.out.println(a[3]);
			
		} catch (Exception e) {
			System.out.println("index 3 is absent in the array");
			System.out.println("simpli change the value of index");
			
		}
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("by");
	}

}

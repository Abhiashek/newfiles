package exeptionpack;

public class Trycatchfinlly {
	public static void main(String[] args) {
		//run time
	    //unchecked expection
				
				int a = 10;
				int b = 0;
				try {
					int c=a/b;
					System.out.println(c);
					
				} catch (Exception e) {
					System.out.println("dont divide 10 by zero");
					System.out.println("change the value of b var");

				}
				finally {
					System.out.println("Hello");
					System.out.println("Hello");
					System.out.println("Hello");
					
				}
				

	}

}

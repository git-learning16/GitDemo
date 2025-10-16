package CoreJava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String literal
		String a = "Milira";
		String a1 ="Milira";
		
		//String with new keyword creates new object everytime
		
		String b = new String ("New Object");
		String c = new String ("New Object");
		
		if (a ==a1) {
			
			System.out.println("Its string literal and no new object is created");
			
		}
		
		if (b == c) {
			
			System.out.println("Its string literal and no new object is created");
		}
		
		else {
			
			System.out.println("New object is created everytime");
		}
		
		// String is an array of characters
		
		String test = " Hello Mac User";
		String testsplitter[]=test.split(" ");
		
		for (int i =0 ; i <testsplitter.length ; i++) {
			System.out.println(testsplitter[i]);
		}
		
		// Reverse a string using charAt
		
		for (int i=test.length()-1; i>=0 ; i--) {
			System.out.print(test.charAt(i));
		}
	}
	
	
	

}

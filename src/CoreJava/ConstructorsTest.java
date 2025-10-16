package CoreJava;

public class ConstructorsTest {
	
	//Default Constructor
	public ConstructorsTest() {
		
		System.out.println("In Default Constructor");
	}
	
	//Parameterized Constructor
	
	public ConstructorsTest(String s) {
		
		System.out.println("In the parameterized constructor " + s);
		
	}
	
	public ConstructorsTest(int a , int b) {
		
		System.out.println("In the 2nd parameterized constructor " + (a*b));
		
	}
	
	//Main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorsTest con = new ConstructorsTest();
		ConstructorsTest con1 = new ConstructorsTest("Mili");
		ConstructorsTest con2 = new ConstructorsTest(4,7);
		
		

	}

}

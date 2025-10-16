package CoreJava.Inheritance;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj = new ChildClass();
		obj.engine();
		obj.gear();
		obj.colour();

	}
	
	//parent variable can be used in Child
	public void engine() {
		System.out.println("New Engnine with colour from parent class " + colour);
	}

}

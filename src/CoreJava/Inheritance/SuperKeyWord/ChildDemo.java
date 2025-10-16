package CoreJava.Inheritance.SuperKeyWord;

public class ChildDemo extends ParentDemo {

	String name = "Mili";
	int a =10;
	
	public ChildDemo()
	{
		super();// it has to in first line to call the parent constructor
		System.out.println("In child constructor");
	}
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);// parent variable is used
	}
	
	
	
	public void getData()
	{
		
		super.getData();//parent method is used
		System.out.println("In child method");
	}
	
	public int sum() {
		int a =2;
		return (a+this.a); //using this keyword to call the global variable
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo child = new ChildDemo();
		child.getName();
		child.getData();
		System.out.println(child.sum());

	}

}

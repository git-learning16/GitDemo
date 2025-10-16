package CoreJava.Interface;

public class TrafficImplementation implements TrafficSignalRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficImplementation obj = new TrafficImplementation();
		obj.green();
		obj.red();
		obj.yellow();
		obj.amber();

	}
	
	// Method created in this class
	
	public void amber() {
		System.out.println("Get Ready");
	}
	
	
	
	// Methods implemented from Interface
	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Please STOPP");
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("GO GO GO");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Pease wait");
		
	}

}

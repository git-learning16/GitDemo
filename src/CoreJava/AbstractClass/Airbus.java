package CoreJava.AbstractClass;

public class Airbus extends FlightDesign{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airbus obj = new Airbus();
		obj.engine();
		obj.saftey();
		obj.colour();
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		
		System.out.println("Set colour to Orange");
		
	}

}

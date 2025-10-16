package CoreJava;

public class MethodsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsIntro obj = new MethodsIntro();
		obj.getdata();
		getdata1();// no need to define object for this
		
		MethodsIntro obj1 = new MethodsIntro();
		String name =obj1.getdata2();
		System.out.println(name);
		
	

	}

	public void getdata() {
		System.out.println("In get Method");
	}
	
	//with static keyword
	public  static void getdata1() {
		System.out.println("In get Method 1");
	}
	
	//with return type
	public String  getdata2() {
		System.out.println("In get Method 2");
		return ("Welcome to getdata2 Method");
	}
}

package CoreJava;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
			int j[] = new int [4];
			System.out.println(j[6]);
		}
		
		catch(ArithmeticException ar) {
			System.out.println("Arithmetic Error");
		}
		
		catch(ArrayIndexOutOfBoundsException ar) {
			
			System.out.println("Array Error");
			
		}
		
		catch (NullPointerException ne) {
			
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e) {
			System.out.println("General Exception");
		}
		
		finally {
			System.out.println("Gets executed whatever happens");
		}
		


	}

}

package CoreJava;

public class WhileandDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		while (i<10) {
			
			if (i % 2 == 0) {
				System.out.println( i + " divisible by 2");
			}
			
			i++;
			
		}
		
		int j =2;
		
		do {
			
			System.out.println(i);
			if (j % 2 == 0) {
				System.out.println( j + " divisible by 2");
			}
			
			System.out.println("In do while loop");
			
			j++;
			
			
		} while (j>10);

	}

}

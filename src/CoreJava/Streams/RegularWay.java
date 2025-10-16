package CoreJava.Streams;

import java.util.ArrayList;

public class RegularWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Eve");
		names.add("Allora");
		names.add("Archer");
		names.add("Amul");
		
		int count =0;
		
		for (String s : names) {
			System.out.println(s);
		}
		
		for (int i=0; i<names.size(); i++) {
			
			String newnames = names.get(i);
			if (newnames.startsWith("A")) {
				
				count ++;
			
				
			}
		}
		
		System.out.println(count);

	}

}

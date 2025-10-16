package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Karthic");
		a.add("Rajasekaran");
		a.add("new");
		
		for ( String s : a) {
			System.out.println(s);
		}
		
		
		//Converting normal array to ArrayList
		String name [] = {"A", "B" ,"C"};
		 List<String> newname =Arrays.asList(name);
		 System.out.println(newname.get(2));
		 System.out.println(newname.contains("A"));
		 

	}

}

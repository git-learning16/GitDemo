package CoreJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name [] = {"Allen","BigShow" ,"Curtis" ,"America" ,"Africa"};
		List<String> names = Arrays.asList(name);
		//using map() method and sorted () method
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		List<String> names1 = Arrays.asList("Australia" ,"Canada" ,"Germany","France");
		
		//concatenate 2 list and sorted it
		 Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
		 newstream.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 
		 //using Match to do comparison
		 boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Australia"));
		 System.out.println(flag);
		

	}

}

package CoreJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = Stream.of("Apple", "Orange" ,"Kiwi", "Tomato").filter(s->s.endsWith("e")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(fruits.get(1));
		
		//get the unique values from the list and then sort it
		
		List<Integer> values = Arrays.asList(1,2,2,4,5,5,6,8,7,1);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Last value "+ li.getLast());
	}

}

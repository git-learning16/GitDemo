package CoreJava.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Eve");
		names.add("Allora");
		names.add("Archer");
		names.add("Amul");
		
		long newcount = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(newcount);
		
		//forEach is important
		names.stream().filter(s->s.length()>=4).forEach(s->System.out.println(s));
		
		//Another way to define stream
		long bcount=Stream.of("Balu","Baiyya","Bajji","Zepto","Arch").filter(s->s.startsWith("B")).count();
		System.out.println(bcount);

	}

}

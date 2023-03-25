import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
//    	List<Person> people = new ArrayList<>();
//		people.add(new Person("Sumayya", 120));
//		people.stream().filter(person -> person.billions >= 100).collect(Collectors.toList());
//		List<Person> sortedList = people.stream()
//				.filter(person -> person.billions >= 100)
//				.sorted(Comparator.comparing(person -> person.name))
//				.collect(Collectors.toList());  
//		sortedList.forEach(person -> System.out.println(person.name));
//		
//		List<Integer> collect = IntStream.iterate(0, n -> n+2)
//				.mapToObj(Integer::valueOf)
//				.limit(10)
//				.collect(Collectors.toList());
//		System.out.println(collect);
		
//		Stream<Double> randoms = Stream.generate(Math::random).limit(100);
//		System.out.println(randoms);
		
//		Stream<Character> combined = 
//				Stream.concat(characterStream("Hello"), 
//				characterStream("World"));
//		
//		public static Stream<Character> characterStream(String s) {
//			List<Character> result = new ArrayList<>();
//			for (char c : s.toCharArray()) 
//			result.add(c);
//			return result.stream();
//			}
//		
		//Integer[] arrOfInt = {1, 3, 5, 7};
		//Stream<Integer> strOfInt = Stream.of(arrOfInt);
		//strOfInt.
		
		//System.out.println(strOfInt);
		
//		List<Integer> collect2 = Stream.generate(() -> (new Random()).nextInt(100))
//				.limit(10)
//				.collect(Collectors.toList());

		

	}

}

//class Person{
//	String name;
//	int billions;
//	
//	public Person(String name, int billions) {
//		this.name=name;
//		
//	}
//	
//}

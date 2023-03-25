import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//		
//		//List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//		
//		Random random = new Random();
//		random.ints().limit(10).sorted().forEach(System.out::println);
//		
//		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//		//get list of unique squares
//		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//		System.out.println(squaresList);
		
//		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
//		System.out.println(count);
		
		
//		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//		System.out.println(filtered);
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
	}

}

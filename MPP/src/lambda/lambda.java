package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach((n) -> {System.out.println(n);});
	    
	    Consumer<Integer> m = (n) -> { System.out.println(n); };
	    numbers.forEach(m);

	}

}

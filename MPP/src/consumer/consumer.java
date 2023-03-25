package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumer {

	public static void main(String[] args) {
		
		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		c.accept("Raja");
		
		Consumer<Integer> con = (x) -> {  // lambda expression
	         System.out.println(x + 10);
	         System.out.println(x - 10);
	      };
	      con.accept(10);
	      
	}
}
	      
//	      BiConsumer<String, String> bc = (x, y) -> { System.out.println(x + y);};
//	      bc.accept("1", "2");
	      
//	      List<Person> plist = Arrays.asList(new Person("RAJA"), new Person("ADITHYA"));
//	      acceptAllEmployee(plist, p -> System.out.println(p.name));
//	      acceptAllEmployee(plist, p -> {p.name = "unknown";});
//	      acceptAllEmployee(plist, p -> System.out.println(p.name));
//	   }
//	public static void acceptAllEmployee(List<Person> plist, Consumer<P> con) {
//	      for(Person p : plist) {
//	         con.accept(p);
//	      }
//	   }
//	}

//Person class
//class Person {
//public String name;
//public Person(String name) {
//   this.name = name;
//}
//}	



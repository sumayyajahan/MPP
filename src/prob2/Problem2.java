package prob2;

import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*
 * Print to the console the list of book titles in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length ascending
 * of the title ( smaller number of characters first), then by reverse of the title 
 * "xza" comes before "azx"
 */
public class Problem2 {

	public static void main(String[] args) {
		//use this list  Hint: create 6/27/2015 like this: LocalDate.of(2015, 6, 27) 
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		
		List<String> list1 = list.stream()
				.filter(f -> f.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(m -> m.getCopy().getBook().getTitle())
				.sorted((new LengthComparator()).thenComparing((new TextComparator()).reversed()))
                .collect(Collectors.toList());
						
		System.out.println(list1);		
	}
	

}

class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String p1, String p2) {
		
		if(p1.length()>p2.length()) {
			
			return 1;
		}else if(p1.length()<p2.length()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}

class TextComparator implements Comparator<String>{

	@Override
	public int compare(String p1, String p2) {
		
		if(p1.compareTo(p2) > 0){
			return 1;
		}else if(p1.compareTo(p2) < 0) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}


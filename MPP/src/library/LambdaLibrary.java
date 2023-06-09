package library;

import java.sql.Date;
import java.util.Calendar;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LambdaLibrary {
	// Query A (for Problem 1A) given a member's checkout record, determine
	// whether some
	// bookcopy in the record is overdue (a bookcopy is overdue if it is not
	// available
	// and its due date is before now.

	public static final Predicate<CheckoutRecord> OVERDUEBOOK = record -> record
			.getCheckoutEntries()
			.stream()
			.filter(entry -> Date.valueOf(entry.getDueDate()).before(
					Calendar.getInstance().getTime()))
			.filter(entry->!entry.getCopy().isAvailable()).count() > 0;

	// Query B (for Problem 1B) Given a BookCopy copy and a LibraryMember mem,
	// return true if mem has ever checked out this copy
	public static final BiPredicate<LibraryMember, BookCopy> EVERCHECKEDOUT = (
			mem, copy) -> mem.getRecord().getCheckoutEntries().stream()
			.filter(entry -> entry.getCopy().equals(copy)).count() > 0;

	// Query C (for Problem 1C) given a list of all library members, return a
	// list, in
	// reverse sorted order (by first name), of the
	// full names (first name + <space> + last name) of those library members
	// who have never checked out a book

}

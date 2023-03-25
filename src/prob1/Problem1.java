package prob1;

import java.util.function.BiConsumer;

//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {
	
	// name and type of lambda goes here
	TriPredicate<Double, Double, Double> tripredicate1 =
			(x, y, z) -> x * y * z < x + y;
	
	// representing lambda as a method reference
	TriPredicate<Double, Double, Double> tripredicate2 = Problem1::comVal;
	public static boolean comVal(Double x, Double y, Double z) {
		
		return x * y * z < x + y;
	}
	
	
	//representing lambda as a static nested class
	static class MyPredicate implements TriPredicate<Double, Double, Double> {

		@Override
		public boolean test(Double x, Double y, Double z) {
			
			return x * y * z < x + y;
		}
	}
	
	//evaluate with Double inputs 2.1, 0.35, 0.35
	public void evaluator() {
		System.out.println(tripredicate1.test(2.1, 0.35, 0.35));
		System.out.println(tripredicate2.test(2.1, 0.35, 0.35));
		System.out.println((new MyPredicate()).test(2.1, 0.35, 0.35));
	}
	
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}

package functional;

import java.util.Comparator;
import java.util.stream.Stream;
import java.util.List;
import java.util.Random;

public class WorkingWithStreams {
	public static void main(String... args) {
    var l = List.of("Monday", "Tuesday", "Wednesday");
		var st1 = Stream.of("one", "two", "three", "four");
		var st2 = Stream.iterate(1, n -> n <=5, i -> i * 3);
		var st3 = Stream.iterate(20, n -> n > 0, n -> n - 2);
		var st4 = Stream.generate(Math::random);
    var st5 = l.stream(); // Creating an stream from a List

		// Terminal operations
		st1.forEach(System.out::println);
		System.out.println("Count on st2: " + st2.count());
		st3.max(Comparator.naturalOrder()).ifPresent(max -> System.out.println("Max in st2: " + max));
		st4.limit(3).forEach(System.out::println);
    st5.forEach(System.out::println);

    // Create an stream of random primitives
    new Random().ints(1, 30)
      .limit(5)
      .forEach(System.out::println); 
	}
}

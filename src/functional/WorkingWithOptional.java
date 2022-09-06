package functional;

import java.util.Optional;

public class WorkingWithOptional {

	public static void main(String... args) {
		// Creation
		Optional<String> empty = Optional.empty();
		Optional<String> opt1 = Optional.of("Hi");
		Optional<String> opt2 = Optional.ofNullable(null);

		
		// Getting value in a functional way	
		empty.ifPresent(System.out::println);
		opt1.ifPresent(System.out::println);
		opt2.ifPresent(System.out::println);

		//Getting value in a non-functional way
		if (opt1.isPresent()) {
			System.out.println("Get optional's value: " + opt1.get());
		}

		// What to do if value is not present
		System.out.println(empty.orElse("Default value for empty optional."));
		System.out.println(opt2.orElseGet( () -> "Default value with supplier for optional with null value."));

		// throws java.util.NoSuchElementException
		//System.out.println(opt2.orElseThrow());
		try {
      System.out.println(opt2.orElseThrow(() -> new IllegalStateException("The optional does not have a value.")));
    } catch(IllegalStateException ex) {
      System.out.println("Exception thronw by Optional.orElseThrow(Throwable t): " + ex);
    }

   //Intermediate operations
   System.out.println("Intermediate operations in Optional<T>");
   //Optional<Integer> optionalNumber = Optional.of(10);
   Optional<Integer> optionalNumber = Optional.empty();
    System.out.println("Trying out filter() and flatMap()");
    optionalNumber.filter( x -> x % 2 == 0)
      .flatMap( x -> Optional.of(x * x)) // useful then the mmaping already returns an Optional<T>
      .ifPresent(System.out::println);

    System.out.println("Trying out map() and ifPresentOrElse(consumer, action)");
    optionalNumber.filter( x -> x > 10)
    .map(x -> x * -1)
    .ifPresentOrElse(System.out::println, () -> System.out.println("Optional<T> is empty."));
	}
}



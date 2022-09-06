package functional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithCollectors {
  public static void main(String... args) {
    var st1 = Stream.of(10, 9, 8, 7);

    String str = st1
                  .map(Object::toString)
                  .collect(Collectors.joining(" - "));
    System.out.println("Collectors.joining(): " + str);
    
  }
}


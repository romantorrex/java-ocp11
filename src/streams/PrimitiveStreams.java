package streams;

import java.util.stream.IntStream;
import java.util.Arrays;

public class PrimitiveStreams {
 public static void main(String args[]) {
    var max = IntStream.empty().max();
    System.out.println("Max of an empty int stream: " + max);

    var values = new int[]{3, 5, -1, 20, 100, 49};
    max = IntStream.of(values).max();
    var min = IntStream.of(values).min();
    var average = IntStream.of(values).average();
    var sum = IntStream.of(values).sum();

    System.out.println("Values: " + Arrays.toString(values));
    System.out.println("Max of int stream: " + max);
    System.out.println("Min of int stream: " + min);
    System.out.println("Average of int stream: " + average);
    System.out.println("Sum of int stream: " + sum);

    //var statistics = IntStream.of(values).summaryStatistics();
    var statistics = IntStream.empty().summaryStatistics();

    System.out.println("Summary statistics of empty stream:\n" + statistics);
    statistics = IntStream.of(values).summaryStatistics();
    System.out.println("Summary statistics of non-empty stream:\n" + statistics);
    statistics.accept(1000);

    System.out.println("Statistics after accepting 100:\n" + statistics);

 }
}

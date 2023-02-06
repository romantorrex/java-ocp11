package arrays;

import java.util.Arrays;

/** Examples of using methods in {@link Arrays}.*/
public class ArraysMethods {
  public static void main(String... args) {
    int[] a = new int[] {3, 2, 0, 9, 15};
    int[] b = {3, 2, 0, 9, 15};

    System.out.printf(" %s compare to %s = %d %n", Arrays.toString(a), Arrays.toString(b), Arrays.compare(a,b));

    b = new int[] {3, 8, 0, 9, 15};
    System.out.printf(" %s compare to %s = %d %n", Arrays.toString(a), Arrays.toString(b), Arrays.compare(a,b));
  
    b = new int[] {3, 2, -5, 9, 9};
    System.out.printf(" %s compare to %s = %d %n", Arrays.toString(a), Arrays.toString(b), Arrays.compare(a,b));

    var array = new int[] {5, 100, 30, 54, -5, 8};

    System.out.printf("Element %d is at position %d in %s.%n", 54, Arrays.binarySearch(array, 54), Arrays.toString(array)); // result undefined

  Arrays.sort(array);
    System.out.printf("Element %d is at position %d in %s.%n", 54, Arrays.binarySearch(array, 54), Arrays.toString(array));

    System.out.printf("Element %d is at position %d in %s.%n", 1, Arrays.binarySearch(array, 1), Arrays.toString(array));

    System.out.printf("Element %d is at position %d in %s.%n", 40, Arrays.binarySearch(array, 40), Arrays.toString(array));
    
    System.out.printf("Element %d is at position %d in %s.%n", -10, Arrays.binarySearch(array, -10), Arrays.toString(array));

    var small = new char[] {'a','b','c'};
    var large = new char[] {'a', 'b', 'c', 'd', 'e'};

    System.out.printf("Compare %s and %s is %d.%n", Arrays.toString(small), Arrays.toString(large), Arrays.compare(small, large));
    System.out.printf("Compare %s and %s is %d.%n", Arrays.toString(large), Arrays.toString(small), Arrays.compare(large,small));
    
    small = new char[] {'a','b','z'};
    large = new char[] {'a', 'b', 'f'};
    System.out.printf("Compare %s and %s is %d.%n", Arrays.toString(small), Arrays.toString(large), Arrays.compare(small, large));
    System.out.printf("Compare %s and %s is %d.%n", Arrays.toString(large), Arrays.toString(small), Arrays.compare(large,small));
    System.out.printf("Mismatch of %s and %s is %d.%n", Arrays.toString(small), Arrays.toString(large), Arrays.mismatch(small, large));
    System.out.printf("Mismatch of %s and %s is %d.%n", Arrays.toString(small), Arrays.toString(small), Arrays.mismatch(small, small));
  }
}


package security;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ImmutableObjectExample {
  public static void main(String... arg) {
    Book b = new Book("Thinking In Java", List.of("Bruce Eckel"), 1_150);

   System.out.println(b);
  }
}

/**
 * Example of how to create an immutable class:
 * 1. Make class final
 * 2. Make all fields private
 * 3. Do not define setters and make fields final
 * 4. Do not allow mutable fields to be modified.
 * 5. Define a constructor to set all fields of the object. Make copies if needed.
 */
final class Book {
  private final String title;
  private final List<String> authors;
  private final long numberOfPages;

  public Book(String title, List<String> authors, long numberOfPages) {
    this.title = title;
    this.authors = new ArrayList<String>(authors); // Make a copy of a muttable parameter
    this.numberOfPages = numberOfPages;
  }

  public String getTitle() {
    return title;
  }

  public long getNumberOfPages() {
    return numberOfPages;
  }

  public String getAuthor(int index) {
    return authors.get(index);
  }

  @Override
  public String toString() {
    String listOfAuthors = authors.stream().collect(Collectors.joining(","));
    return String.format("%s, by %s. Pages: %d", title, listOfAuthors, numberOfPages);
  }
}


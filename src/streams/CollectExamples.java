package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectExamples {

  public static void main(String args[]) {
    var books = List.of(
      new Book("Effective Java", "Bloch", 900),
      new Book("Harry Potter 1", "J.K.", 380),
      new Book("Algorithms", "Katty", 1200),
      new Book("Atomic Habits", "James", 430),
      new Book("Harry Potter 2", "J.K.", 432),
      new Book("Refactoring", "Andy", 722)
    );

    var byAuthor = books.stream()
      .collect(Collectors.groupingBy(Book::getAuthor));

    System.out.println("Books by author:\n" + byAuthor);

    var moreThan500Pages = books.stream()
      .collect(Collectors.partitioningBy(b -> b.getTotalPages() > 500));

    System.out.println("Books with more than 500 pages: " + moreThan500Pages.get(Boolean.TRUE));
  }

}


class Book {
    private int totalPages;
    private String author;
    private String title;
 
    Book(String title, String author, int totalPages) {
      this.title = title;
      this.author = author;
      this.totalPages = totalPages;
    }
 
    public int getTotalPages() {
      return totalPages;
    }
 
    public String getTitle() {
      return title;
    }
 
    public String getAuthor() {
      return author;
    }
 
    @Override
    public String toString() {
      return String.format("%s by %s, %d pages.", title, author, totalPages);
    }
  }

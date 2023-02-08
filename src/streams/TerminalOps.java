package streams;

import static java.util.Comparator.comparing;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOps {

  public static void main(String[] args) {
    List<Book> books = List.of(new Book("Book 1", "Camilla", 345), new Book("Book 2", "Stephen", 781), new Book("Book 3", "Oscar", 180), new Book("Book 4", "Stephen", 1022));

   // min()/max() of a Stream require a comparator
   Book minPages = books.stream()
        .min(comparing(Book::getTotalPages))
        .get();

    System.out.println("Book with less pages: " + minPages);

    // min()/maxx() of primitive streams does not require comparator
    int maxPages = books.stream()
      .mapToInt(Book::getTotalPages)
      .max()
      .getAsInt();

    System.out.println("Max number of pages: " + maxPages);
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

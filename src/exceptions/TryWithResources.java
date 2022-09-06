package exceptions;

import java.io.Closeable;


class Door implements AutoCloseable {
  public void close() {
    System.out.println("Closing Door");
  }
}

class Window implements Closeable {
  public void close() {
    System.out.println("Closing Window");
    throw new RuntimeException("Window could not be closed.");
  }
}


public class TryWithResources {
  public static void main(String... args) {
    try (var w = new Window(); var d = new Door()) {
      System.out.println("It is going to rain.");
    } catch(Exception ex) {
      System.out.println("Nothing happend");
    } finally {
      System.out.println("Bye.");
    }
  }
}


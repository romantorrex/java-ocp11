package exceptions;

import java.io.IOException;

public class CheckedExceptions {

  public static void main(String... args) {
    try {
    // does not compile if the this try block does not actually throws
    // a checked exception
      method();
   } catch(IOException ex) { }
   // } catch(RuntimeException ex) { }
  }

  // static void method() throws IOException {}
  static void method() {}
}


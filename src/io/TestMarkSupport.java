package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestMarkSupport {
  public static void main(String... args) {
    try (BufferedReader fr = new BufferedReader(new FileReader("files/letters.txt"))) {
      int i = 1;
      var data = fr.read();
      fr.mark(10);
      System.out.println((char) data);
      data = fr.read();
      System.out.println((char) data);
      data = fr.read();
      System.out.println((char) data);
      fr.reset();
      data = fr.read();
      System.out.println((char) data);
      data = fr.read();
      System.out.println((char) data);
    } catch(IOException ex) {
      ex.printStackTrace();
    }
  }
}

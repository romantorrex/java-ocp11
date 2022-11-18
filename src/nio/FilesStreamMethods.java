package nio;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BiPredicate;
import java.util.stream.Stream;


/** Examples of using methods of {@link Files} that return a {@link Stream}. */
public class FilesStreamMethods {

  public static void main(String... args) throws IOException {
    var srcDir = Path.of("./src");
    try(var s = Files.walk(srcDir)) {
       var filesCount =s
        .filter( p -> Files.isRegularFile(p) && p.toString().endsWith(".java"))
        .count();
        //.forEach(System.out::println);
       System.out.printf("Total of JAVA files in %s is %d. %n", srcDir, filesCount);

    }

    // Displaying the contents of a directory with Files.list()
    // If the path is not a directory, then a NotDirectoryException is thrown
    try ( var s = Files.list(srcDir)) {
      s.map( p -> p.toString().toUpperCase())
        .forEach(System.out::println);
    }

    // Reading the lines of a text file with Files.lines()
   var readmeFile = Path.of("README.md");
    try (var s = Files.lines(readmeFile)) {
      var letterCount = s.mapToInt(String::length)
      .sum();

      System.out.printf("The file %s has %d letters. %n", readmeFile, letterCount);
    }

    var currentDir = Path.of(".");
    BiPredicate<Path, BasicFileAttributes>  moduleInfoPredicate = (p, attr) -> attr.isRegularFile() && p.toString().contains("module-info.java");
    try (var s = Files.find(currentDir, 5, moduleInfoPredicate)) {
      System.out.println("The module-info.java files in this project are: ");
      s.forEach(System.out::println);
    }
  }

}

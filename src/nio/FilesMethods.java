package nio;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;

/** Examples of using the methods available in {@link Files} class. */
public class FilesMethods {

  public static void main(String[] args) throws IOException {
    Path outDir = Path.of("out");
    Path fileOne = Files.createFile(outDir.resolve(Path.of("fileOne.txt")));
    var text = "Lorem ipsum dolor sit amet.";
    try (var bw = Files.newBufferedWriter(fileOne, StandardOpenOption.APPEND)){
      bw.write(text);
      bw.newLine();
      bw.write(text);
      bw.flush();
    }

    Path fileOneCopy = outDir.resolve(Path.of("fileOneCopy.txt"));
    System.out.printf("%s exists(): %s %n", fileOne.getFileName(), Files.exists(fileOne));
    System.out.printf("%s exists(): %s %n", fileOneCopy.getFileName(), Files.exists(fileOneCopy));
    System.out.printf("Copy %s to %s.%n", fileOne.getFileName(), fileOneCopy.getFileName());
    Path target = Files.copy(fileOne, fileOneCopy, StandardCopyOption.REPLACE_EXISTING);
    System.out.printf("%s exists(): %s %n", fileOneCopy, Files.exists(fileOneCopy));
    System.out.printf("%s exists(): %s %n", target, Files.exists(target));
    System.out.printf("Size of %s is %d %n", fileOne.getFileName(), Files.size(fileOne));

    List<String> lines = Files.readAllLines(fileOneCopy);
    System.out.printf("Lines in %s : %n %s %n", fileOneCopy.getFileName(), lines);

    try {
      Files.delete(Path.of("HelloWorld.java")); // This file does not exists
    } catch(NoSuchFileException ex) {
      System.out.println("Excepcion while trying to delete a file that does noe exists. " + ex.getMessage());
    }



    Files.delete(fileOne);
    Files.deleteIfExists(fileOneCopy);
  }
}

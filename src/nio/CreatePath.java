package nio;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.Paths;


/** Ways of creating an instance of {@code Path} */
public class CreatePath {
  public static void main(String... args) throws URISyntaxException {
      // 1. Factory methods in Path
      var p1 = Path.of("nio", "file1.txt");
      var uri = new URI("nio/file2.txt");
      var p2 = Path.of(uri);

      // 2. Ffactory methods from Paths
      var p3 = Paths.get("nio", "file1.txt");
      var p4 = Paths.get(uri);

      // 3. From an instance of File
      File file = new File("nio/file1.txt");
      var p5 = file.toPath();

      // 4. From an instance of FileSystem
      var p6 = FileSystems.getDefault().getPath("nio", "file1.txt");
  }
}


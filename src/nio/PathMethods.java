package nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Examples of using the methods in the {@code Path} interface. */
public class PathMethods {
  public static void main(String... args) throws IOException {
    var relativePath = Path.of("src", "main", "java", "HelloWorld.java");
    var absolutePath = Path.of("/Users/developer/documents/presentations");

    callMethodsOf(relativePath);
    callMethodsOf(absolutePath);

    var path1 = Path.of("./exceptions/checked");
    var path2 = Path.of("../");

    System.out.printf("%s -> normalized: %s %n", path1, path1.normalize()); // removes redundant symbols
    System.out.printf("%s -> normalized: %s %n", path2, path2.normalize());

    System.out.printf("%s -> toRealPath(): %s %n", path2, path2.toRealPath());

    var path3 = Paths.get("/User/maria/dir/file.txt");
    var path4 = Paths.get("/User/pedro/dir/file.txt");

    // The name of the file counts one level.
    System.out.printf("%s relativize %s = %s", path3, path4, path3.relativize(path4));
  }

  private static void callMethodsOf(Path path) {
    System.out.println("Calling path methods on "  + path);

    int nameCount = path.getNameCount();
    System.out.printf("getNameCount(): %d%n", nameCount);
    System.out.println("First path element: " + path.getName(0));
    System.out.println("Last path element:  " + path.getName(nameCount - 1));
    System.out.println("getFileName(): " + path.getFileName());
    System.out.println("isAbsolute(): " + path.isAbsolute());
    System.out.println("getParenti(): " + path.getParent()); //Returns the path of the parent.;
    System.out.println("getRoot(): " + path.getRoot());
    System.out.println("subpath(1, 3): " + path.subpath(1, 3));
    System.out.println("toAbsolutePath(): " + path.toAbsolutePath());
    var otherAbsolute = Path.of("/etc/file");
    var otherRelative = Path.of("lambdas/Examples.java");
    System.out.println("resolve(otherRelative): " + path.resolve(otherRelative));
    System.out.println("resolve(otherAbsolute): " + path.resolve(otherAbsolute));
  }
}

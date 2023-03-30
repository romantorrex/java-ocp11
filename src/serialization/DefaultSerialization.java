package serialization;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/* Example of writing/reading an object of  a class using the default behaviour of serialization. */
public class DefaultSerialization {
  public static void main(String[] arg) throws IOException, ClassNotFoundException {
    UserData data = new UserData(new int[]{1, 2}, "guest", "how old are you?");
    System.out.println("Data to be serialized: " + data);
    try (var oos = new ObjectOutputStream(new FileOutputStream("userData"))) {

      oos.writeObject(data);
      oos.flush();
    }

    try(var ois = new ObjectInputStream(new FileInputStream("userData"))) {

      Object o = ois.readObject();
      System.out.println("Deserialized data: " + o);
    
    }

  }
}

class UserData implements Serializable {
 private  int[] numbers;
 private String alias;
 private transient String question;
 // MoreData is not serializable but since md is null the serialization happens without issues.
 private MoreData md;
 //private MoreData md = new MoreData();
 
 UserData(int[] numbers, String alias, String question) {
  this.numbers = numbers;
  this.alias = alias;
  this.question = question;
 }

 @Override
 public String toString() {
  return String.format("%s - %s - %s - %s", alias, Arrays.toString(numbers), question, md);
 }

}

class MoreData {
  private int age = 18;

  @Override
  public String toString() {
    return "age: " + age;
  }
}

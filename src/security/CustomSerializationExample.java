package security;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

public class CustomSerializationExample {
  public static void main(String... args) throws IOException, ClassNotFoundException {
    Client c = new Client("Roman", 40, "12345678");
    System.out.println(c);

   File file = new File("clients.log");
    try (var os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      os.writeObject(c);
    }

    try (var is = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      System.out.println(is.readObject());
    }
  }
}

class Client implements Serializable {
  private String name;
  private int age;
  private String creditCardNumber;

  Client(String name, int age, String creditCardNumber) {
    this.name = name;
    this.age = age;
    this.creditCardNumber = creditCardNumber;
  }

  @Override
  public String toString() {
    String ccn = creditCardNumber == null ? "NA" : creditCardNumber.substring(5, 8); // credit card number has 8 digits. 
    return String.format("[name: %s, age: %d, ccn: ****-*%s]", name, age, ccn);
  }

  private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("name", String.class), 
      new ObjectStreamField("creditCardNumber", String.class)};

  private void writeObject(ObjectOutputStream oos) throws Exception {
    System.out.println("Serializing a client.");
    ObjectOutputStream.PutField fields = oos.putFields();

    fields.put("name", name);
    //fields.put("age", age); //throws IllegalArgumentException since age is not included in serialPersistentFields.
    fields.put("creditCardNumber", encode(creditCardNumber));

    oos.writeFields(); // must be called otherwise the object is not serialized.
  }


  private void readObject(ObjectInputStream ois) throws Exception {
    System.out.println("Deserializing a client.");
    ObjectInputStream.GetField fields = ois.readFields();

    this.name = (String) fields.get("name", null);
    //this.age = (Integer) fields.get("age", null);
    this.creditCardNumber = decode((String) fields.get("creditCardNumber", null));
  }

  private static String encode(String str) {
    return "********";
  }

  private static String decode(String str) {
    return "00000000";
  }
}

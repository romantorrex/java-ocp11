package  collections;

import java.util.function.BiFunction;
import java.util.HashMap;
import java.util.Map;;

/** Usage of common methods of a {@link Map}. */
public class MapMethods {
   public static void main(String args[]) {

    var hm = new HashMap<Integer, String>();

   // HashMap access null, as the key and as value.
   // When putting a key-value pair, put() returns the previous value or null
   // if the key did not exist
   System.out.printf("put(null, \"?\") returns %s %n", hm.put(null, "?"));
   System.out.printf("put(0, null) returns %s %n", hm.put(0, null));
   System.out.printf("put(2, \"XXX\") returns %s %n", hm.put(2, "XXX"));
   System.out.printf("put(2, \"two\") returns %s %n", hm.put(2, "two"));
   System.out.printf("put(10, \"ten\") returns %s %n", hm.put(10, "ten"));

   System.out.println("Map: " + hm);
   BiFunction<String, String, String> remapping = (a, b) -> a + ", " + b;


   hm.merge(5, "five", remapping); // key does not exist
   // throws NullPointerException
   // hm.merge(2, null, remapping); // key exists with a non-null value. We try to map the key to null
   // key exists but its value is null
   hm.merge(0, "zero", remapping);
   // key does not exist and we try to map it to null
   //  Throws NPE
   //hm.merge(-1, null, remapping);
 
   // key exists and has a non-null value.
   hm.merge(10, "TEN", remapping);
   // key exists and we try to remove it
   hm.merge(null,"null", (a, b) -> null);

   System.out.println("Map after some merges: " + hm);
  }
}

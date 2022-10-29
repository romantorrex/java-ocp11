package concurrency;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

/**
 *  Example of using the methods in an ScheduledExecutorService
 */
public class ScheduledExecutorExample {

  public static void main(String... args) throws Exception {
    System.out.printf("%s Main starts.%n", LocalTime.now());
    ScheduledExecutorService executor = null;
    try {
      //executor = Executors.newSingleThreadScheduledExecutor();
      executor = Executors.newScheduledThreadPool(6);

      executor.schedule(() -> task("Task 1"), 2, TimeUnit.SECONDS);
      executor.schedule(() -> task("Task 2"), 4, TimeUnit.SECONDS);
      //executor.scheduleWithFixedDelay(() -> task("Task 3"), 0, 4, TimeUnit.SECONDS);
      executor.scheduleAtFixedRate(() -> task("Task 3"), 0, 4, TimeUnit.SECONDS);
    } finally {
      Thread.sleep(15000);
      if (executor != null) {
        executor.shutdown();
      }
    }
    if (executor != null) {
      executor.awaitTermination(20, TimeUnit.SECONDS);
    }
    System.out.printf("%s Main ends.%n", LocalTime.now());
  }

  private static void task(String name) {
    System.out.printf("%s Executing %s  ....%n", LocalTime.now(), name);
    try {
      Thread.sleep(3000);
    } catch(InterruptedException ex) {
      throw new RuntimeException("Error while executing task " + name, ex);
    }
    System.out.printf("%s Finished %s.%n", LocalTime.now(), name);
  }
}

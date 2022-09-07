package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/** Class that creates single thread executor service and runs few tasks. */
public class SingleThreadExecutor {

  public static void main(String... args) {
    ExecutorService service = null;

    try {
      System.out.println("Main starts.");

      // Single thread executor is used to guarantee that task are run sequentially.
      service = Executors.newSingleThreadExecutor();

      Runnable taskOne = () -> System.out.println("Task 1.");
      Runnable taskTwo = () -> System.out.println("Task 2");

      service.execute(taskOne);
      service.execute(taskTwo);
    
      System.out.println("Main ends.");
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }
  }
}


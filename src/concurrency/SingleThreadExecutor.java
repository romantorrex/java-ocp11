package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;

/** Class that creates single thread executor service and runs few tasks. */
public class SingleThreadExecutor {

  public static void main(String... args) throws Exception {
    ExecutorService service = null;
    System.out.println("Main starts " + LocalDateTime.now());

    try {

      // Single thread executor is used to guarantee that task are run sequentially.
      service = Executors.newSingleThreadExecutor();

      Runnable taskOne = () -> task("Task 1");
      Runnable taskTwo = () -> task("Task 2");

      service.execute(taskOne);
      service.execute(taskTwo);
    
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }

    service.awaitTermination(8, TimeUnit.SECONDS); // May throw Interrupted exception
    System.out.println("Main ends: " + LocalDateTime.now());
  }

  static void task(String taskName) {
    try {
      System.out.println("Executing: " + taskName);
      Thread.sleep(3000);
    } catch(InterruptedException ex){
      ex.printStackTrace();
    }
  }
}


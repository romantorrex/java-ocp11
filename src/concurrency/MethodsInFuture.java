package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class  MethodsInFuture {
  public static void main(String ...args) throws Exception {
    System.out.println("Main starts");
    ExecutorService executor = null;

    try {
      int n1 = 10, n2 = 8;
      Callable<Integer> task1 = () -> task("Task 1", n1);
      Callable<Integer> task2 = () -> task("Task 2", n2);

      //executor = Executors.newSingleThreadExecutor();
      executor = Executors.newFixedThreadPool(3);

      Future<Integer> result1 = executor.submit(task1);
      Future<Integer> result2 = executor.submit(task2);
      System.out.format("Sum up to %d is %d%n", n1, result1.get()); // get() may throw InterruptedException
      System.out.format("Sum up to %d is %d%n", n2, result2.get());

      
    
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }

    System.out.println("Main ends");
    
  }

  static int task(String taskName, int n) {
    try {
      Thread.sleep(3000);
      System.out.println("Executed " + taskName);
      return n * (n + 1) / 2;
    } catch (InterruptedException ex) {
      throw new RuntimeException("Error while executing " + taskName, ex);
    }
  }
}


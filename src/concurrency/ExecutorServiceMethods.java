package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.List;

/** 
 * Sample code to show the usage of methods in {@link ExecutorService}.
 * */
public class ExecutorServiceMethods {
  public static void main(String... args) throws Exception {
    ExecutorService executor = null;

    System.out.println("Begin ...");
    try {
      executor = Executors.newSingleThreadExecutor();
      System.out.println("Trying submit(Runnable r)");
      submitRunnable(executor);
      System.out.println("Trying submit(Callable c)");
      submitCallable(executor);
      System.out.println("Trying invokeAny(Collection<? extends Callable<T>> tasks)");
      invokeAny(executor);
      System.out.println("Trying invokeAll(Collection<? extends Callable<T>> tasks)");
      invokeAll(executor);
    } finally {
      executor.shutdown();
    }
    
    if (executor != null) {
      executor.awaitTermination(15, TimeUnit.SECONDS);
    }
    System.out.println("End...");
  }

  private static void submitRunnable(ExecutorService executor) {
    Runnable task = () -> task("Runnable Task.", 2);
    Future<?> result = executor.submit(task);
    System.out.println("Result of submit with Runnable is null? " + (result == null));
 }

  private static void submitCallable(ExecutorService executor) throws Exception {
    Callable<Integer> task = () -> task(10, 10, 2);

    Future<Integer> result = executor.submit(task);

    System.out.println("Resutl: " + result.get()); 
  }

  private static void invokeAny(ExecutorService executor) throws Exception {
    Callable<Integer> task1 = () -> task(2, 5, 2);
    Callable<Integer> task2 = () -> task(50, 50, 0);
    Callable<Integer> task3 = () -> task(1, 1, 3);
    Callable<Integer> task4 = () -> task(3, 2, 1);
    Integer result = executor.invokeAny(List.of(task1, task2, task3, task4));

    System.out.println("Result of the invoked sum task: " + result);
  }

  private static void invokeAll(ExecutorService executor) throws Exception {
    Callable<Integer> task1 = () -> task(0, 1, 4);
    Callable<Integer> task2 = () -> task(-1, 1, 3);

    executor.invokeAll(List.of(task1, task2));
  }

  private static void task(String taskName, int timeInSeconds) {
    try {
      System.out.println("Doing " + taskName);
      Thread.sleep(timeInSeconds * 1000);
    } catch(InterruptedException ex) {
      System.out.println("Error while doing " + taskName + ": " + ex.getMessage());
    }
  }

  private static int task(int a, int b, int timeInSeconds) {
    task(a + " + " + b, timeInSeconds);
    return a + b;
  }
}

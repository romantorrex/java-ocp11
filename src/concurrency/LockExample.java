package concurrency;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

/**
 * Example of synchronizing tasks with {@link ReentrantLock}.
 */
public class LockExample {

  public static void main(String... args) {
    System.out.printf("%s Main starts.%n", LocalTime.now());

    ExecutorService executor = null;
    try {
      executor = Executors.newFixedThreadPool(6);
      var lock = new ReentrantLock();
      var task1 = new WashDishes(4, lock, "Kevin");
      var task2 = new WashDishes(4, lock, "Justin");
      var task3 = new CleanRoom(2, lock, "Tom");
      var task5 = new CookMeal(2, lock, "Peter");
      var task4 = new CleanRoom(1, lock, "Sabrina");
      var task6 = new CookMeal(2, lock, "Sara");

      executor.submit(task3);
      executor.submit(task1);
      executor.submit(task5);
      executor.submit(task2);
      executor.submit(task6);
      executor.submit(task4);
    } finally {
      if(executor != null) {
        executor.shutdown();
      }
    }

    System.out.printf("%s Main ends.%n", LocalTime.now());
  
  }

}

/**
 * Task that waits until the lock is available.
 */
class WashDishes implements Runnable {
  private final Lock lock;
  private final int duration;
  private final String name;

  WashDishes(int duration, Lock lock, String name) {
    this.lock = lock;
    this.duration = duration;
    this.name = name;
  }

  @Override
  public void run() {
    lock.lock(); // Only one person can use the dish washer.
    try {
      System.out.printf("%s %s is starting to wash the dishes.%n", LocalTime.now(), name);
      Thread.sleep(1000 * duration);
      System.out.printf("%s %s has finished washing the dishes.%n", LocalTime.now(), name);
    } catch(InterruptedException ex) {
      throw new RuntimeException("Something wrong with " + name, ex);
    } finally {
      lock.unlock();
    }
  }
}

/**
 * Task that does nothing if the lock is not available.
 */
class CleanRoom implements Runnable {
  private final int duration;
  private final Lock lock;
  private final String name;

  CleanRoom(int duration, Lock lock, String name) {
    this.duration = duration;
    this.lock = lock;
    this.name = name;
  }

  @Override
  public void run() {
    System.out.printf("%s %s is checking if someone else is doing chores.%n", LocalTime.now(), name);
    boolean canWork = lock.tryLock();
    try {
      if(canWork) {
        System.out.printf("%s %s is starting to clean the room..%n", LocalTime.now(), name);
        Thread.sleep(1000 * duration);
        return;
      } 
      System.out.printf("%s %s will try later.%n", LocalTime.now(), name);
    } catch(InterruptedException ex) {
        throw new RuntimeException("Something went wrong with " + name, ex);
    } finally {
      if (canWork) {
        System.out.printf("%s %s has finished .%n", LocalTime.now(), name);  
        lock.unlock();
      }
    }
  }
}

/**
 * Task that waits some secs if the lock is not available.
 */
class CookMeal implements Runnable {
  private final int duration;
  private final Lock lock;
  private final String name;

  CookMeal(int duration, Lock lock, String name) {
    this.duration = duration;
    this.lock = lock;
    this.name = name;
  }

  @Override
  public void run() {
    System.out.printf("%s %s is checking if someone else is doing chores.%n", LocalTime.now(), name);
    boolean canWork = false;
    try {
      canWork = lock.tryLock(5, TimeUnit.SECONDS);
      if(canWork) {
        System.out.printf("%s %s is starting to cook the meal..%n", LocalTime.now(), name);
        Thread.sleep(1000 * duration);
        return;
      } 
      System.out.printf("%s %s cannot cook now.%n", LocalTime.now(), name);
    } catch(InterruptedException ex) {
        throw new RuntimeException("Something went wrong with " + name, ex);
    } finally {
      if (canWork) {
        System.out.printf("%s %s has finished .%n", LocalTime.now(), name);  
        lock.unlock();
      }
    }
  }
}

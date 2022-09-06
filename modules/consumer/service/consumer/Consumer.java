package service.consumer;

import service.locator.ServiceLocator;
import service.provider.Service;

public class Consumer {

  public static void main(String... args) {
   long total = ServiceLocator.totalImplementations();

    System.out.println("Total service providers: " + total);

    ServiceLocator.createService().call();
  }
}


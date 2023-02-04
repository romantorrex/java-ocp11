package service.locator;

import service.provider.Service;
import java.util.ServiceLoader;

public class ServiceLocator {

  public static long totalImplementations() {
    return ServiceLoader.load(Service.class).stream().count();
  }

  public static Service createService() {
    ServiceLoader<Service> services = ServiceLoader.load(Service.class);

//   ServiceLoader.Provider<Service> provider = services.findFirst().orElseThrow(() -> new IllegalStateException("No implementations available."));
//
   return services.findFirst().orElseThrow(() -> new IllegalStateException("No implementations available."));
  
   //  return provider.get();
  }
}


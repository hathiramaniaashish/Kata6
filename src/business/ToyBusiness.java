package business;

import factories.SerialNumberGenerator;
import toyproducts.Toy;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public void add(String name, ToyFactory toyFactory) {
        toyFactories.put(name, toyFactory);
    }
    
    public Toy produceToy(String type) {
        return toyFactories.get(type).produceToy(generator.next());
    }
    
}

package business;

import toyproduct.Toy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    final public SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
}

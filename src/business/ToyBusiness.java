package business;

import toyproducts.Toy;
import factories.ToyFactory;

public class ToyBusiness {
    final private ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type) {
        return toyFactory.produceToy(type);
    }
    
}

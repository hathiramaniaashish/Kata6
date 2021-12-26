package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "car":
                AsianCarToy car = new AsianCarToy(generator.next());
                return car;
                
            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(generator.next());
                return helicopter;
                
            default:
                return null;
        }
    }
    
}

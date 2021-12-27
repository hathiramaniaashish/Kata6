package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;

public class AmericanSubmarineToy implements Toy {
    final private Integer serialNumber;
    final private String type = "submarine";
    final private ComponentFactory factory;
    private Engine engine;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n", type, serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling '%s' '%d'\n", type, serialNumber);
    }
    
    @Override
    public void prepare() {
        System.out.printf("Preparing '%s' '%d'\n", type, serialNumber);
        engine = factory.createEngine();
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}

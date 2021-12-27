package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;

public class AsianHelicopterToy implements Toy {
    final private Integer serialNumber;
    final private String type = "helicopter";
    final private ComponentFactory factory;
    private Engine engine;
    private RotorBlade rotorBlade;

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();
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
        rotorBlade = factory.createRotorBlade();
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}

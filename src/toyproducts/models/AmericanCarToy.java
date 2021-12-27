package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;

public class AmericanCarToy implements Toy {
    final private Integer serialNumber;
    final private String type = "car";
    final private ComponentFactory factory;
    private Engine engine;
    final private Wheel[] wheels = new Wheel[4];

    public AmericanCarToy(Integer serialNumber) {
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
        for (int i = 0; i < wheels.length - 1; i++)
            wheels[i] = factory.createWheel();
    }

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}

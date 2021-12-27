package componentfactories;

import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;

public interface ComponentFactory {
    
    public Wheel createWheel();
    public Engine createEngine();
    public RotorBlade createRotorBlade();
}

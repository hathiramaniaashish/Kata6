package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy() {
        Toy toy = createToy(SerialNumberGenerator.getInstance().next());
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber); 
    
}

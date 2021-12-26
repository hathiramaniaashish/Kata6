package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    final public SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(String type) {
        Toy toy = createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(String type); 
    
}

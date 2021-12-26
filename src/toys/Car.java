package toys;

public class Car {
    final private Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public void pack() {
        System.out.printf("Packing car '%d'\n", serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling car '%d'\n", serialNumber);
    }
    
}

package factories;

public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    static private SerialNumberGenerator INSTANCE = null;

    private SerialNumberGenerator() {
        
    }
    
    public static SerialNumberGenerator getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SerialNumberGenerator();
        return INSTANCE;
    }
            
    public Integer next() {
        return serialNumber++;
    }
    
}

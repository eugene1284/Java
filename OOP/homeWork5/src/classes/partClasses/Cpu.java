package OOP.homeWork5.src.classes.partClasses;

public class Cpu extends Part {

    private String family;
    private String socket;

    public Cpu(String brand, String family, String socket) {
        super(brand);
        this.family = family;
        this.socket = socket;
    }


    public String getFamily() {
        return family;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public String toString() {
        return String.format("CPU. brand: %s, family: %s, socket: %s", this.brand, family, socket) ;
    }
}
package OOP.homeWork5.src.classes.partClasses;

public class MainBoard extends Part {
    private final String model;
    private final String socket;
    private final String chipset;
    private final String memory;

    private final String formFact;

    public MainBoard(String brand, String model, String socket, String chipset, String memory, String formFact) {
        super(brand);
        this.model = model;
        this.socket = socket;
        this.chipset = chipset;
        this.memory = memory;
        this.formFact = formFact;
    }

    public String getModel() {
        return model;
    }

    public String getSocket() {
        return socket;
    }

    public String getChipset() {
        return chipset;
    }

    public String getFormFact() {
        return formFact;
    }


    @Override
    public String toString() {
        return String.format("MainBoard. brand: %s, model: %s, socket: %s, chipset: %s, memory: %s, formFact: %s",
                this.brand, model, socket, chipset, memory, formFact);
    }
}

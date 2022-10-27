package HomeWork6.classes.data.Part;

public abstract class Part {
    protected String brand;

    public Part(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

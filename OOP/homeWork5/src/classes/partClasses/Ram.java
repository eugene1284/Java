package OOP.homeWork5.src.classes.partClasses;

public class Ram extends Part {


    private String ramVol;
    private int intRamVol;
    private String ramType;
    private String ramParam;

    public Ram(String ramVol, String ramType, String ramParam) {
        super("RAM");
        this.ramVol = ramVol;
        this.ramType = ramType;
        this.ramParam = ramParam;
        this.intRamVol = Integer.parseInt(ramVol.replaceAll("GB", ""));
    }

    public String getRamVol() {
        return ramVol;
    }

    public int getIntRamVol() {
        return intRamVol;
    }

    public String getRamType() {
        return ramType;
    }

    public String getRamParam() {
        return ramParam;
    }

    @Override
    public String toString() {
        return String.format("%s. Volume: %s; Type: %s",
                this.brand, ramVol, ramType);
    }
}

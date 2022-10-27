package HomeWork6.classes.data.impl;

import HomeWork6.classes.Memory;

public class Desktop extends Computer {
    private Integer powerSupply;

    public Desktop(String id, String model, Memory memory, String ssd){
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public Integer getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Integer powerSupply) {
        this.powerSupply = powerSupply;
    }
}

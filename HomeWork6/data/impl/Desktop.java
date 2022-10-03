package HomeWork6.data.impl;

import HomeWork6.data.Computer;
import HomeWork6.Memory;

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

// data

package HomeWork6.data.impl;

import HomeWork6.data.Computer;
import HomeWork6.Memory;

public class NoteBook extends Computer { //наследуем от абстрактных классов
    private Integer batteryCapacity;

    public NoteBook(String id, String model, Memory memory, String ssd, Integer batteryCapacity){
        super(id, model, memory, ssd);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Notebook id=" + id + ", " +
                "model: \"" + model + "\", " +
                "memory: " + memory + " GB, " +
                "SSD:" + ssd + " GB, " +
                "Battery: " + BatteryCapacity + " mAh";
    }
}
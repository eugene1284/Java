// data

package HomeWork6;

public class Data_NoteBook {

    private int id;
    private String model;
    private int memory;
    private int ssd;

    public Data_NoteBook(int id, String model, int memory, int ssd){
        this.id = id;
        this.model = model;
        this.memory = memory;
        this.ssd = ssd;
    }



    @Override
    public String toString() {
        return "Notebook id=" + id + ", " +
                "model:'" + model + "', " +
                "memory: " + memory + " GB, " +
                "SSD:" + ssd + " GB";
    }
}
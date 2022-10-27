package HomeWork6.classes;

import HomeWork6.classes.data.impl.Desktop;

import java.util.Arrays;
import java.util.List;

public class DesktopLoader {
    public DesktopLoader(){}

    public void loadDskt(List<Desktop> dsktList){

        Desktop n1 = new Desktop("pc1", "jun", Memory.EIGHT, "256");
        Desktop n2 = new Desktop("pc2", "mid", Memory.SIXTEEN, "512");
        Desktop n3 = new Desktop("pc3", "sen", Memory.SIXTEEN, "1024");
        dsktList.addAll(Arrays.asList(n1, n2, n3));
    }
}

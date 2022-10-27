package OOP.homeWork5.src.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Preloader {
    HashMap<String, List<String>> parts = new HashMap<>();

    public static void main(String[] args) {
        Preloader parse = new Preloader();
        parse.parser();
    }

    void parser() {
        this.parts.put("cpu", Arrays.asList(processor.split("\n")));
        this.parts.put("mainBoard", Arrays.asList(mainB.split("\n")));
        this.parts.put("ram", Arrays.asList(memory.split("\n")));
    }

    String mainB = "" +
            "Asus;H97-PRO;1150;iH97;DDR3;ATX\n" +
            "Asus;Z97-PRO;1150;iZ97;DDR3;ATX\n" +
            "MSI;H61I-E35/W8;1155;Intel H61 B3;DDR3;Mini-ITX\n" +
            "EliteGroup (ECS);H61H2-I2 (B3);1155;H61;DDR3;miniITX\n" +
            "ASUS;X79-DELUXE;2011;Intel X79;DDR3;ATX\n" +
            "Intel;BLKDQ77KB;1155;Intel Q77;DDR3;Thin Mini-ITX\n";

    String processor = "" +
            "AMD;Phenom II X4 925;AM3\n" +
            "AMD;Athlon II X2 220;Socket AM3\n" +
            "INTEL;Core i7 4960X;2011;BX80633I74960X 3.60/15M Box\n" +
            "Intel;Core i5 4570;1150;(3.2GHz) 6MB OEM (SR14E)\n" +
            "INTEL;Core i7 4960X;2011;CM8063301292500 3.60/15M Tray\n" +
            "Intel;Core i3-3240;1155;(3.40ГГц, 2x256КБ+3МБ, EM64T, GPU) (109600)";

    String memory = "" +
            "4GB;DDR2;Kingston for HP/Compaq (375004-B21) DIMM (PC-3200) 400MHz ECC Registered Dual Rank Kit (2 x 2Gb) (KTH-MLG4/4G)\n" +
            "2GB;DDR2;Kingston DIMM (PC-3200) 400MHz ECC Registered Dual Rank Kit (2 x 2Gb) (KTH-MLG4/4G)\n" +
            "16GB;DDR3;(1x16GB) 2Rx4 PC3L-10600R-9 Low Voltage Registered DIMM for DL360p/380pGen8, ML350pGen8, BL460cGen8, SL230s/250sGen8 (647901-B21)\n" +
            "16GB;DDR3;(1x16GB) 2Rx4 PC3-12800R-11 Registered DIMM for DL360p/380pGen8, ML350pGen8, BL460cGen8, SL230sGen8 (672631-B21)\n" +
            "8GB;DDR3;IBM (1x8GB 2Rx4 1.5V) PC3-12800 CL11 ECC 1600MHz LP RDIMM (x3550 M4/x3650 M4) (90Y3109)\n" +
            "4GB;DDR3;(1x4GB) 1Rx4 PC3L-10600R-9 Low Voltage Registered DIMM for DL360p/380pGen8, ML350pGen8, BL460cGen8, SL230s/250sGen8 (647893-B21)";
}

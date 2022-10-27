package HomeWork6.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Preloader {
    HashMap<String, List<String>> parts = new HashMap<>();

    public static void main(String[] args) {
        Preloader parse = new Preloader();
        parse.parser();
    }

    public void parser() {
        this.parts.put("cpu", Arrays.asList(processor.split("\n")));
        this.parts.put("mainBoard", Arrays.asList(mainB.split("\n")));
    }

    String processor = "" +
            "AMD;Phenom II X4 925;AM3\n" +
            "AMD;Athlon II X2 220;Socket AM3\n" +
            "INTEL;Core i7 4960X;2011;BX80633I74960X 3.60/15M Box\n" +
            "Intel;Core i5 4570;1150;(3.2GHz) 6MB OEM (SR14E)\n" +
            "INTEL;Core i7 4960X;2011;CM8063301292500 3.60/15M Tray\n" ;

    String mainB = "" +
            "ASUS;H81M-A;1150;H81;DDR3;mATX\n" +
            "ASUS;M5A78L-M LX3;AM3+;AMD 760G;DDR3;mATX\n" +
            "ASUS;SABERTOOTH 990FX R2.0;AM3+;AMD 990FX;DDR3;ATX\n" +
            "Biostar;A780L3B;AM3;HT5.2GT/s;DDR3;Micro ATX\n" +
            "ASUS;M5A97 R2.0;AM3+;AMD 970;DDR3;ATX\n" +
            "MSI;H61I-E35/W8;1155;Intel H61 B3;DDR3;Mini-ITX\n" +
            "EliteGroup (ECS);H61H2-I2 (B3);1155;H61;DDR3;miniITX\n" +
            "ASUS;X79-DELUXE;2011;Intel X79;DDR3;ATX\n";
}

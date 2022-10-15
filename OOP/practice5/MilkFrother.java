package OOP.practice5;

public class MilkFrother {
    private String milk;
    private String frothededMilk;

    public void setMilk(String milk){ this.milk = milk;}

    public String frothedMilk(String milk){
        setMilk("40 ml");
        System.out.println("froth Milk");
        return frothededMilk;
    }

}

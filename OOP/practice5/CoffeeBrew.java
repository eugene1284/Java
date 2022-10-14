package OOP.practice5;

// иллюстрация принципа I — Interface Segregation (Принцип разделения интерфейсов)

public class CoffeeBrew implements Brew_uncorrect {

    @Override
    public void addWater() {

    }

    @Override
    public void addSugar() {

    }

    @Override
    public void addCoffee() {

    }

    @Override
    public void addTea() {
// данный метод нам тут не нужен, но удалить его мы не можем из-за ограничений наследования,
// поэтому было бы хорошо следовать принципу  I — Interface Segregation (Принцип разделения интерфейсов) и
// и побить интерфейс Brew на несколько меньших интерфейсов
    throw new IllegalStateException("unsupported method");
    // интерфейс Brew - перегружен
    }


}

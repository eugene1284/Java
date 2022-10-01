package OOP.practice1;

public class Duck implements Birds{ 
// Duck - реализация
// 


    @Override // меняем логику наследуемого метода
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("");
    }


    @Override
    public void walk() {
        // TODO Auto-generated method stub
        
    } // implements - реализует



}

// интерфейс это маркер - описание того, что нужно реализовать в классе 
// наследование - это что то уже реализованное
// а реализация - это когда мы пишем новую логику по описанию

// класс может наследовать только от одного
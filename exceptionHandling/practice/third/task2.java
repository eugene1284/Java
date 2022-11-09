package exceptionHandling.practice.third;

/*
Создайте класс Счетчик, у которого есть метод add(),
увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
Подумайте какой тип исключения подойдет лучше всего.
*/

public class task2 {
    public static void main(String[] args) throws Exception {

        task2Counter t2C = new task2Counter();

        try (t2C){
            t2C.add();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

        t2C.add();

    }

}

package Lambda;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operation;
        operation = ((x, y) -> x+y);

        int result = operation.calculate(10,20);
        System.out.println(result);
    }

    interface Operationable{ //Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе.
        // При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.
        int calculate (int x, int y);
    }
}

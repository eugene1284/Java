package exceptionHandling.practice.third;

public class task3ExceptionDivideByZero extends ArithmeticException{
    public task3ExceptionDivideByZero() {
        super("operation divide by zero not supported");
    }
}

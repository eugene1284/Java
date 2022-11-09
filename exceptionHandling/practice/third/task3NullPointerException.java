package exceptionHandling.practice.third;

public class task3NullPointerException extends NullPointerException{
    public task3NullPointerException() {
        super("you are accessing a non-existent array element");
    }
}

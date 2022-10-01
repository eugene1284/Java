package homework5_2;

/*
Задание 2

Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
 */

public class HomeWork5_2 {
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();
        book.setContacts(); // Создать структуру телефонной книги

        // пользователь
        User user = new User();
        user.name = "xm";
        user.phone = "18888";
        user.address = "sichuan";


        // Добавить пользователя
        book.addUser(user);


        User user1 = new User();
        user1.name = "Tom";
        user1.phone = "1111";
        user1.address = "sichuan";
        book.addUser(user1);


        // получить результат
        System.out.println(book.contacts);
    }
}
